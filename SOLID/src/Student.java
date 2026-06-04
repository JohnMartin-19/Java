//Dependency Inversion Principle (DIP)
//The Dependency Inversion Principle advocates that high-level modules should not directly depend on low-level modules —
// instead they should rely on abstractions. DIP promotes loose coupling in code, enhancing its flexibility and maintainability.
//In Java, DIP is realized through dependency injection, where high-level modules depend on abstractions rather than concrete low-level modules.

// Abstraction — the contract
public interface StudentRepository {
    void save(Student student);
    Optional<Student> findById(int id);
    List<Student> findAll();
}

// Low-level implementation 1
public class PostgreSQLStudentRepository implements StudentRepository {
    @Override
    public void save(Student student) {
        System.out.println("Saving to PostgreSQL: " + student.getName());
    }

    @Override
    public Optional<Student> findById(int id) {
        // PostgreSQL query
        return Optional.empty();
    }

    @Override
    public List<Student> findAll() {
        // PostgreSQL query
        return new ArrayList<>();
    }
}

// Low-level implementation 2 — for testing
public class InMemoryStudentRepository implements StudentRepository {
    private Map<Integer, Student> store = new HashMap<>();

    @Override
    public void save(Student student) {
        store.put(student.getId(), student);
    }

    @Override
    public Optional<Student> findById(int id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(store.values());
    }
}

// High-level class — depends on abstraction, not implementation
public class StudentService {
    private final StudentRepository repository; // interface, not concrete class

    // Dependency injected through constructor
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void enroll(Student student) {
        repository.save(student);
        System.out.println(student.getName() + " enrolled successfully");
    }
}

// consumption — swap implementations without touching StudentService
StudentService prodService  = new StudentService(new PostgreSQLStudentRepository());
StudentService testService  = new StudentService(new InMemoryStudentRepository());