package hundreddayscodeforexperince;
//https://www.toptal.com/java/interview-questions
//https://www.interviewbit.com/java-interview-questions-for-5-years-experience/
//https://www.index.dev/post/top-6-senior-java-developer-interview-questions-and-answers
//https://www.interviewbit.com/java-interview-questions-for-5-years-experience/
/**
 *
 * 1.What are classloaders and different types of class loaders in java?
 * Classloaders in Java are responsible for loading Java classes into the JVM (Java Virtual Machine) at runtime.
 * They locate the bytecode of a class, define it in the JVM, and make it available for execution.
 *
 * Java provides a hierarchical classloader system where each classloader has a parent classloader. When a class is requested, the classloader first delegates
 * the task to its parent classloader. If the parent classloader cannot find the class, the classloader attempts to load the class itself.
 *
 * Here are the different types of classloaders in Java:
 *
 * Bootstrap Classloader:
 *                     Also known as the primordial classloader, it is the parent of all classloaders and is implemented in native code.
 *                     It loads the core Java classes,
 * such as those in the java.lang package, from the bootstrap classpath. It is not written in Java and cannot be directly accessed from application code.
 *
 * Extension Classloader:
 *               The extension classloader is the child of the bootstrap classloader. It loads classes from the extension classpath,
 *               which includes the standard extension
 * directory ($JAVA_HOME/lib/ext) and any additional directories specified by the java.ext.dirs system property.
 *
 * System Classloader:
              Also known as the application classloader or the default classloader, it is the child of the extension classloader.
 * It loads classes from the application classpath, including user-defined classes and third-party libraries. It is responsible for loading the classes used
 * by the application.
 * Custom Classloaders:
 *                    In addition to the built-in classloaders, Java allows developers to create custom classloaders by extending the java.lang.ClassLoader
 * class. Custom classloaders can define their own behavior for loading classes from different sources, such as network locations, databases,
 * or encrypted archives. They can override the findClass() method to specify their own loading logic.
 * Custom classloaders are often used in specialized scenarios, such as application servers, dynamic class reloading,
 * or implementing custom security policies.
 *
 * The classloader hierarchy and delegation model allow for isolation and separation of classes loaded by different classloaders, enabling modularity,
 * security, and dynamic loading of classes at runtime.
 *
 * It's important to note that classloaders play a crucial role in Java's security model. They help enforce access controls and prevent unauthorized
 * loading of classes from untrusted sources. They also contribute to Java's ability to dynamically load and unload classes, supporting features like
 * dynamic class loading, hot swapping, and plugin architectures.
 *
 *
 *
 *
 *
 *
 * 2.You are using a third party library in your project which you think may be replaced in future with a new library,
 * how will you code so that its easier to change the library in future?
 *
 *
 * To make it easier to replace a third-party library with a new library in the future, you can follow certain coding practices and design patterns
 * that promote loose coupling and modularity. Here are some strategies you can employ:
 *
 * Use Abstraction:
 * Avoid directly using specific classes or implementations from the third-party library throughout your code.
 * Instead, define your own interfaces or abstract classes that encapsulate the functionality you need from the library.
 * Implement these interfaces or abstract classes using the third-party library, keeping the library-specific code separate.
 * Dependency Injection:
 * Instead of instantiating the third-party library classes directly in your code, use dependency injection to inject the library components as dependencies.
 * By using dependency injection frameworks like Spring, Guice, or Dagger, you can easily switch the library implementations by changing the configuration.
 * Facade Pattern:
 * Consider creating a facade or wrapper around the third-party library.
 * The facade provides a simplified interface to interact with the library and shields the rest of the codebase from direct dependencies on the library.
 * Configuration and Properties:
 * Externalize library-specific configuration and properties into separate files (e.g., properties files, XML, or YAML).
 * This way, if you need to switch to a new library, you can modify the configuration without changing the core code.
 * Use Design Patterns:
 * Use design patterns like Factory Method, Abstract Factory, or Strategy pattern to encapsulate the instantiation and usage of library classes.
 * This allows you to change the library implementation by modifying the corresponding factory or strategy class.
 * Unit Testing:
 * Write comprehensive unit tests for your code, but also mock the interactions with the third-party library in the tests.
 * This enables you to test your code independently of the actual library implementation.
 * Keep Third-Party Code Isolated:
 * Avoid spreading the third-party library code all over your application.
 * Instead, centralize the interactions with the library in specific modules or classes, making it easier to change or replace them later.
 * Documentation:
 * Document the usage of the third-party library in your codebase clearly.
 * Provide guidelines for future developers on how to interact with the library and how to replace it if needed.
 * By following these practices, you can minimize the impact of replacing a third-party library with a new one. This approach will improve the maintainability and flexibility of your codebase and make it easier to adapt to changes in the future.
 *
 *
 *
 *
 *
 * 3.You have two similar looking methods in your code where most of the logic is same except data set which is difference and there is a custom logic
 * to convert that data into an object? How will refactor this code?
 *
 * To refactor the code with two similar-looking methods that have most of the logic the same, but differ in the data set and custom logic to convert
 * the data into an object, you can follow the Strategy Pattern and Template Method Pattern.
 *
 * Here's how you can do it:
 *
 * Strategy Pattern:
 * Create an interface (or an abstract class) that defines the method to convert the data into an object.
 * Implement two classes that implement the interface, each with its custom logic to convert the specific data set into an object.
 * In the main class, instead of calling the custom logic directly, use the interface to delegate the conversion logic.
 * java
 * Copy code
 * // Interface for data conversion strategy
 * interface DataConverter {
 *     Object convertData(String data); // Method to convert data into an object
 * }
 *
 * // Concrete implementation for DataSet1
 * class DataSet1Converter implements DataConverter {
 *     @Override
 *     public Object convertData(String data) {
 *         // Custom logic to convert data from DataSet1 into an object
 *         // ...
 *         return object;
 *     }
 * }
 *
 * // Concrete implementation for DataSet2
 * class DataSet2Converter implements DataConverter {
 *     @Override
 *     public Object convertData(String data) {
 *         // Custom logic to convert data from DataSet2 into an object
 *         // ...
 *         return object;
 *     }
 * }
 * Template Method Pattern:
 * Create an abstract class that contains the common logic shared by both methods and defines an abstract method that needs to be implemented by
 * subclasses for custom data conversion.
 * Implement two subclasses that extend the abstract class and provide custom data conversion logic.
 * java
 * Copy code
 * abstract class DataProcessor {
 *     // Common logic shared by both methods
 *     public void process(String data) {
 *         // Common processing logic
 *         // ...
 *
 *         // Custom data conversion logic
 *         Object object = convertData(data);
 *
 *         // More common processing logic
 *         // ...
 *     }
 *
 *     // Abstract method to be implemented by subclasses
 *     protected abstract Object convertData(String data);
 * }
 *
 * // Concrete implementation for DataSet1
 * class DataSet1Processor extends DataProcessor {
 *     @Override
 *     protected Object convertData(String data) {
 *         // Custom logic to convert data from DataSet1 into an object
 *         // ...
 *         return object;
 *     }
 * }
 *
 * // Concrete implementation for DataSet2
 * class DataSet2Processor extends DataProcessor {
 *     @Override
 *     protected Object convertData(String data) {
 *         // Custom logic to convert data from DataSet2 into an object
 *         // ...
 *         return object;
 *     }
 * }
 * With these refactorings, you can reuse the common logic in a centralized way and provide custom data conversion for different data sets.
 * You can then use the appropriate converter or processor based on the data set, making the code more maintainable and flexible.
 * This approach also adheres to the principles of the Open/Closed Principle (OCP) as it allows you to extend the functionality without modifying the
 * existing code.
 *
 *
 *
 *
 *
 *
 *
 * 4.When does using Microservice architecture make sense and what are scenarios where a Monolith would be more appropriate than Microservices? (hint — latency)
 *Using Microservice architecture makes sense in the following scenarios:
 *
 * Complexity and Scalability:
 * When the application becomes complex with multiple interdependent components.
 * When scalability demands are different for different parts of the application.
 * Microservices allow scaling individual services independently, making it easier to handle varying loads.
 *
 * Independent Development and Deployment:
 * When different teams need to work on different parts of the application simultaneously.
 * When fast and frequent deployment is required for specific services without affecting the whole application.
 *
 * Technology Diversity:
 * When various parts of the application have different technology requirements.
 * Microservices allow you to choose the most suitable technology for each service.
 *
 * Fault Isolation and Resilience:
 * When fault isolation is critical, and the failure of one component should not bring down the entire application.
 * Microservices can isolate failures, making the system more resilient.
 *
 * Ease of Maintenance:
 * When it's easier to maintain smaller, focused services rather than a large, monolithic application.
 * Microservices allow you to focus on specific functionality in isolation.
 *
 * Independent Scaling:
 * When different services have different resource demands and require scaling independently.
 * Microservices allow you to allocate resources based on specific service requirements.
 * On the other hand, a Monolith would be more appropriate in the following scenarios:
 *
 * Simplicity and Small-Scale Projects:
 * For small-scale projects with simple requirements, using a monolithic architecture can be more straightforward and faster to develop.
 * Low Latency and High Performance:
 * For applications requiring low latency and high performance, monolithic architectures can be more efficient due to reduced communication
 * overhead between components.
 * Consistent Technology Stack:
 * When the entire application requires a consistent technology stack, a monolithic architecture is easier to manage and maintain.
 * Developer Familiarity:
 * If the development team is more familiar with monolithic architectures and lacks experience with microservices, starting with a monolith can be a more
 * reasonable choice.
 * Resource Constraints:
 * In situations where resource constraints (e.g., limited budget or limited skilled team members) exist, developing a monolith can be a more practical
 * approach.
 * Remember that choosing between Microservices and Monolith architecture depends on various factors, including the complexity of the project, scalability
 * needs, team expertise, resource availability, and performance requirements. It's essential to carefully evaluate these factors before making a decision.
 * In some cases, a hybrid approach, using microservices for certain parts and a monolith for others, might be the most appropriate solution.
 *
 *
 *
 *
 *
 *
 * 5.What problem is solved by SAGA design Pattern in Microservices? What are alternatives?
 * The SAGA design pattern in Microservices addresses the problem of maintaining data consistency and handling distributed transactions across multiple
 * microservices in a reliable and coordinated manner. In a Microservices architecture, each microservice typically manages its own data,
 * and a single business operation may involve multiple microservices collaborating to complete a task. This can lead to challenges in ensuring that the
 * overall operation remains consistent and atomic, especially in the face of failures or partial success.
 *
 * The SAGA pattern is used to manage long-running distributed transactions, where an operation spans multiple microservices and may require compensating
 * actions if certain parts of the operation fail. It is primarily employed to maintain data consistency and to ensure that business operations are
 * completed successfully or rolled back in a controlled manner.
 *
 * Key aspects of the SAGA pattern:
 *
 * SAGA Transactions:
 * A SAGA is a sequence of smaller transactions, each handled by a separate microservice. Each transaction represents an individual step of the overall
 * business operation. Each step is either completed successfully or rolled back.
 *
 * Compensating Actions:
 * If a transaction fails or encounters an error, compensating actions are executed to revert the changes made by the preceding transactions.
 * This ensures that the system remains consistent despite partial failures.
 *
 * State Management:
 * The state of each transaction and its corresponding compensating action is maintained to track the progress of the overall SAGA.
 *
 * Orchestration and Choreography:
 * The SAGA pattern can be implemented using two approaches: orchestration and choreography. In orchestration,
 * there is a central component (e.g., a SAGA orchestrator) that coordinates and manages the sequence of transactions. In choreography,
 * each microservice communicates directly with others to decide the next step in the SAGA.
 * Alternatives to the SAGA design pattern in managing distributed transactions in Microservices include:
 *
 * Two-Phase Commit (2PC): A traditional distributed transaction protocol where a coordinator requests each participant to commit or abort the transaction.
 * It ensures atomicity but can suffer from blocking and scalability issues.
 * Compensating Transaction Pattern:
 * Similar to SAGA, it involves executing compensating actions to undo the changes made by preceding steps in case of failures. However,
 * it may require more complex logic and careful handling of compensations.
 * Event Sourcing and CQRS: Event Sourcing logs all events that have occurred in the system, and CQRS separates read and write operations.
 * Together, they can help maintain consistency by replaying events to rebuild the state if needed.
 * Event-Driven Architecture (EDA): Using events to propagate changes and state between microservices can help maintain eventual consistency. However,
 * it might not guarantee strong consistency across all services.
 * Each approach has its trade-offs and suitability depending on the specific requirements and constraints of the application.
 * The SAGA pattern provides a balance between consistency, scalability, and fault tolerance in Microservices-based systems.
 *
 *
 *
 *
 *
 * 6.What is Bootstrap class loader and how does it works?
 * check question number 1
 *
 * 7.What is Extensions class loader and how does it works?
 *check question number 1
 *
 *
 *
 *
 *
 * 8.What is application class loader and how does it works?
 * In Java, the Application Class Loader (also known as the System Class Loader or the Default Class Loader) is one of the built-in class loaders
 * provided by the Java Virtual Machine (JVM). It is responsible for loading classes from the application's classpath,
 * which includes the directories and JAR files specified when running the Java application.
 *
 * Here's how the Application Class Loader works:
 *
 * Classpath Setup:
 * When you run a Java application, the JVM sets up the classpath, which is a list of directories and JAR files where the JVM looks for classes.
 * By default, the classpath includes the current directory (.) and any JAR files specified using the -classpath or -cp option.
 * Class Loading Process:
 * When the JVM encounters a class reference in the code, it delegates the task of loading that class to the Application Class Loader.
 * The Application Class Loader first checks whether the class has already been loaded. If the class has been loaded before, it returns the existing java.lang.Class object for that class.
 * If the class has not been loaded yet, the Application Class Loader attempts to find the corresponding class file (.class) in the directories and JAR files specified in the classpath.
 * If the class file is found, the Application Class Loader reads the bytecode from the file, defines the class in memory, and creates a new instance of java.lang.Class representing the loaded class.
 * The JVM makes this Class instance available to the application, allowing you to create objects and interact with the class.
 * Parent Delegation Model:
 * The Application Class Loader follows a delegation model, where it first delegates class loading to its parent class loader (typically the Extension Class Loader).
 * If the parent class loader cannot find the class, the Application Class Loader attempts to load it from the classpath it manages.
 * Class Caching and Unloading:
 * Like other class loaders in Java, the Application Class Loader caches the loaded classes to improve performance and avoid redundant loading.
 * Classes loaded by the Application Class Loader are eligible for garbage collection if there are no references to their instances.
 * Customization:
 * In some cases, developers may need to customize the behavior of the Application Class Loader by extending it and implementing their class-loading logic. However, this is less common compared to customizing the behavior of other class loaders.
 * In summary, the Application Class Loader is responsible for loading classes from the application's classpath, and it follows a delegation model to find and load classes. It is a crucial part of the Java runtime environment, ensuring that the necessary classes are available for the application to execute correctly.
 *
 *
 *
 *
 * 9.When an object becomes eligible for garbage collection?
 * An object in Java becomes eligible for garbage collection when it is no longer reachable or accessible by the running program.
 * The Java Virtual Machine (JVM) employs a garbage collector to automatically reclaim memory occupied by objects that are no longer in use.
 * The process of determining whether an object is eligible for garbage collection is performed by the garbage collector based on the reachability
 * of objects through references.
 *
 * An object can become eligible for garbage collection under the following conditions:
 *
 * No Strong References: When there are no strong references pointing to the object. A strong reference is the usual reference that we use in Java,
 * such as assigning an object to a variable. If no strong references exist, the object becomes eligible for garbage collection.
 * Island of Isolation: If the object is part of an island of objects (i.e., a group of objects that reference each other but are not reachable from any
 * root of the object graph), and there are no strong references to the island from outside, then the entire island of objects becomes eligible for garbage
 * collection.
 * Cyclic References: If there is a cyclic reference between objects (Object A has a reference to Object B, and Object B has a reference to Object A),
 * the cyclically referenced objects become eligible for garbage collection if they are not reachable from any root of the object graph.
 * Weak References: If the object has been assigned to a weak reference, it may be eligible for garbage collection when the JVM detects that no strong
 * references are pointing to it. Weak references allow the garbage collector to collect the object when memory pressure occurs.
 * Finalization: When an object has been through the finalization process (using finalize() method) and is not resurrected (i.e., its finalize() method does
 * not resurrect the object), it becomes eligible for garbage collection.
 * It's important to note that the garbage collection process is non-deterministic, meaning that the JVM runs the garbage collector at its discretion based
 * on memory requirements and other factors. The JVM is responsible for identifying and reclaiming memory occupied by objects that are no longer reachable,
 * freeing developers from manual memory management.
 *
 * Developers can request garbage collection by calling System.gc() or Runtime.gc() methods,
 * but this does not guarantee that garbage collection will occur immediately. The JVM decides when to perform garbage collection based on its own
 * algorithms and memory management strategies.
 *
 *
 *
 *
 *
 * 10.Who performs garbage collection?
 * Garbage collection is a process performed by a programming language's runtime environment or virtual machine. It is not typically performed by individual developers in their code explicitly. Instead, it is a feature provided by many modern programming languages, especially those that use automatic memory management, such as Java, C#, Python, JavaScript, and others.
 *
 * The purpose of garbage collection is to automatically identify and reclaim memory that is no longer in use by the program, thus freeing up resources and preventing memory leaks. The garbage collector periodically scans the program's memory to locate objects that are no longer reachable or referenced by the running program. Once these unreferenced objects are identified, the garbage collector releases the memory occupied by them so that it can be reused for other purposes.
 *
 * The specifics of how garbage collection is implemented can vary depending on the programming language and runtime environment. Some languages allow developers to fine-tune or control aspects of the garbage collection process, but in most cases, it is a transparent and automatic mechanism.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 11.When does garbage collector run in java?
 *In Java, the garbage collector runs automatically in the background, and its timing is managed by the Java Virtual Machine (JVM). The JVM is responsible for memory management and runs the garbage collector when certain conditions are met.
 *
 * The garbage collector in Java is designed to reclaim memory occupied by objects that are no longer reachable or referenced by the program. When an object is no longer referenced by any part of the program, it becomes eligible for garbage collection.
 *
 * The exact timing and frequency of garbage collection depend on the JVM implementation and the garbage collection algorithm being used. Java uses several garbage collection algorithms, including:
 *
 * Serial Garbage Collector: It is a simple, single-threaded garbage collector that is suitable for single-core systems or small applications. It stops all application threads during garbage collection.
 * Parallel Garbage Collector: Also known as the throughput collector, it is a multi-threaded garbage collector that is designed to take advantage of multiple CPU cores. It is well-suited for multi-core systems and aims to achieve higher throughput by parallelizing the garbage collection process.
 * Concurrent Mark-Sweep (CMS) Garbage Collector: This collector tries to minimize the pause times experienced by the application by doing most of the garbage collection work concurrently with the application threads. It is suitable for applications that require low-latency.
 * G1 (Garbage-First) Garbage Collector: G1 is designed to be a low-latency garbage collector with better predictability compared to CMS. It divides the heap into regions and performs garbage collection on selected regions instead of the entire heap.
 * The JVM decides when to run the garbage collector based on factors such as the amount of free memory available, the number of objects that have been created, and the application's resource requirements. When the JVM detects that the heap is getting full or when it's running low on free memory, it will trigger the garbage collector to free up memory by reclaiming unreachable objects.
 *
 * It's important to note that while garbage collection is automatic and managed by the JVM, developers can influence and configure the garbage collector's behavior using command-line options and JVM tuning parameters if necessary. However, for most applications, the default garbage collector settings provided by the JVM are sufficient.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 12.Which algorithm garbage collector uses to perform garbage collection in java?
 *As of my last update in September 2021, Java uses different garbage collection algorithms based on the JVM version and configuration. The choice of garbage collector algorithm can be influenced by JVM options and the specific requirements of the application. Here are some of the common garbage collection algorithms used in Java:
 *
 * Serial Garbage Collector (Serial GC): This is the simplest garbage collector, and it is intended for use on single-threaded or small applications. It stops all application threads during garbage collection. It is typically used for small applications or during development and testing.
 * Parallel Garbage Collector (Parallel GC): Also known as the throughput collector, this garbage collector uses multiple threads to perform garbage collection, making it suitable for multi-core systems. It aims to achieve high throughput by leveraging multiple CPU cores for garbage collection tasks.
 * Concurrent Mark-Sweep (CMS) Garbage Collector (Deprecated in JDK 9): CMS is designed to minimize the pause times experienced by the application during garbage collection. It does most of the garbage collection work concurrently with the application threads. However, CMS has been deprecated in JDK 9 and removed in JDK 14, and it is no longer available in newer versions.
 * G1 (Garbage-First) Garbage Collector: G1 is designed to be a low-latency garbage collector with better predictability compared to CMS. It divides the heap into regions and performs garbage collection on selected regions instead of the entire heap. G1 is the default garbage collector in Java 9 and later versions.
 * Z Garbage Collector (ZGC): ZGC is designed to provide low-latency garbage collection with very short pause times. It is intended for applications requiring large heaps and is available as an experimental feature in JDK 11 and later versions.
 * Shenandoah Garbage Collector (Shenandoah GC): Shenandoah GC is another garbage collector introduced to provide low-pause-time performance. It is suitable for large heaps and is available as an experimental feature in JDK 12 and later versions.
 * Please note that Java continues to evolve, and there might be new updates or garbage collection algorithms introduced after my last update in September 2021. Always refer to the official documentation and release notes of the Java version you are using for the most up-to-date information regarding garbage collection algorithms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 13.List out different garbage collection algorithms?
 * Sure, here is a list of different garbage collection algorithms commonly used in various programming languages and runtime environments:
 *
 * Reference Counting: This is a simple garbage collection algorithm that keeps track of the number of references to each object. When the reference count of an object becomes zero (i.e., no more references point to it), it is considered garbage and can be collected. One limitation of this approach is that it cannot handle cycles of objects with circular references.
 * Mark-and-Sweep: This algorithm involves two phases - the marking phase and the sweeping phase. It starts by marking all reachable objects from a set of root objects. Any objects that are not marked during the marking phase are considered garbage and can be swept and collected during the sweeping phase.
 * Copy-Collection (Copying): This algorithm divides the memory into two parts and alternates between them. It starts by allocating objects in one memory space. When garbage collection is needed, it identifies all reachable objects, then copies them to the other memory space, leaving the old memory space with garbage. This algorithm is efficient for objects with short lifespans.
 * Generational Garbage Collection: This approach divides objects into different generations based on their age. Young objects are more likely to become garbage than older ones. By separating objects into generations, the garbage collector can optimize the collection process and focus on the younger generation more frequently.
 * Parallel Garbage Collection: In this algorithm, multiple threads are used to perform garbage collection concurrently, taking advantage of multi-core systems to speed up the process. It aims to achieve higher throughput by parallelizing the garbage collection work.
 * Concurrent Garbage Collection: This type of garbage collection minimizes pause times by allowing the application to continue running during the garbage collection process. The garbage collector works concurrently with the application threads to identify and collect garbage.
 * Garbage-First (G1) Garbage Collector: G1 is a garbage collection algorithm that divides the heap into regions and performs garbage collection on selected regions instead of the entire heap. It aims to provide low-latency performance and better predictability.
 * Z Garbage Collector (ZGC): ZGC is a garbage collector designed for applications that require low-latency and can work with very short pause times. It is suitable for large heaps and aims to reduce the impact of garbage collection on application response times.
 * Shenandoah Garbage Collector (Shenandoah GC): Shenandoah GC is another garbage collector that provides low-pause-time performance. It is intended for applications with large heaps and aims to minimize the time spent on garbage collection pauses.
 * These garbage collection algorithms have different characteristics and are suitable for various scenarios and application requirements. The choice of garbage collector depends on factors like application size, latency requirements, available hardware resources, and other performance considerations.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 14.Can we force JVM for garbage collection?
 *Yes, you can request the Java Virtual Machine (JVM) to perform garbage collection, but it's important to note that this is just a request, and the JVM may or may not choose to run the garbage collector immediately. The JVM has its own internal heuristics and algorithms to decide when and how to run garbage collection based on factors such as memory usage, application workload, and garbage collection settings.
 *
 * In Java, you can use the System.gc() method or Runtime.getRuntime().gc() to suggest to the JVM that it would be a good time to run garbage collection. For example:
 *
 * java
 * Copy code
 * System.gc(); // Suggest JVM to run garbage collection
 * or
 *
 * java
 * Copy code
 * Runtime.getRuntime().gc(); // Suggest JVM to run garbage collection
 * However, it's important to understand that there are no guarantees that the garbage collector will run immediately after calling System.gc() or Runtime.getRuntime().gc(). The JVM might choose to ignore the request or defer the garbage collection until it deems it necessary.
 *
 * In general, manually triggering garbage collection is not recommended for most applications, as the JVM's automatic garbage collection mechanisms are generally effective at managing memory. Forcing garbage collection can even lead to performance issues in some cases, as it disrupts the JVM's normal garbage collection patterns.
 *
 * If you find yourself considering forcing garbage collection, it's essential to review your application's memory management, object lifecycle, and garbage collection settings to ensure optimal memory usage and performance. Instead of manually requesting garbage collection, it's usually better to allow the JVM to handle memory management and garbage collection automatically.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 15.How to request jvm to perform garbage collection operation?
 *
 *
 *
 *
 *
 *
 *
 *
 * 16.Explain the purpose of finalize method in relation to Garbage collection?
 *In Java, the finalize() method is a method defined in the Object class, the superclass of all Java classes. The purpose of the finalize() method is to provide an opportunity for an object to perform any necessary cleanup operations just before it is garbage collected. It is automatically called by the garbage collector when the object is determined to be eligible for garbage collection.
 *
 * Here's the basic workflow related to the finalize() method and garbage collection:
 *
 * When an object is no longer reachable (i.e., it is not referenced by any active part of the program), it becomes eligible for garbage collection.
 * Before the garbage collector reclaims the memory occupied by the eligible object, it checks whether the object has a finalize() method defined. If the object does have a finalize() method, it is scheduled to be executed.
 * The finalize() method is executed once by the garbage collector before the object is actually deallocated and its memory is freed.
 * After the finalize() method has been executed, the object is no longer reachable, and its memory can be reclaimed during the next garbage collection cycle.
 * It's important to note that the finalize() method has some significant limitations and potential drawbacks:
 *
 * Uncertainty of Execution: There is no guarantee when the finalize() method will be executed, if at all. The garbage collector decides when to run the finalize() method, and it may not run it immediately after an object becomes eligible for garbage collection. As a result, relying on finalize() for critical cleanup tasks or resource release can be unreliable and lead to resource leaks.
 * Performance Impact: The finalize() method can cause a performance impact as the garbage collector needs to execute it, which may introduce delays in the garbage collection process.
 * Deprecation: The finalize() method has been deprecated since Java 9, and it is strongly discouraged to use it in modern Java applications. Instead, developers are encouraged to use try-with-resources or AutoCloseable interfaces for resource cleanup and management.
 * Due to these limitations and potential issues, it is generally recommended to avoid using the finalize() method for important cleanup operations and, instead, use proper resource management techniques like try-with-resources or implementing the AutoCloseable interface to ensure timely release of resources and better control over cleanup operations.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 17.How many times finalize method is called on an Object?
 * In Java, the finalize() method is called at most once on an object. When an object becomes eligible for garbage collection, the JVM will execute the finalize() method for that object once before reclaiming its memory. The finalize() method is called automatically by the garbage collector, and there is no guarantee on the exact timing or order in which it will be executed.
 *
 * It's important to emphasize that the finalize() method is deprecated since Java 9, and it is no longer recommended for use in modern Java applications. Instead, developers are encouraged to use better resource management techniques like try-with-resources or implementing the AutoCloseable interface to ensure timely release of resources and proper cleanup operations.
 *
 * The deprecation of finalize() was due to its limitations and potential issues, such as uncertainty of execution, performance impact, and difficulty in ensuring reliable cleanup of resources. As a result, relying on finalize() for critical cleanup tasks or resource release is discouraged in favor of more reliable and efficient approaches.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 18.Once an object is garbage collected can it become reachable again?
 * Once an object is garbage collected in Java, it cannot become reachable again through normal means. The primary purpose of garbage collection is to identify and reclaim memory occupied by objects that are no longer reachable or referenced by the program.
 *
 * When an object becomes unreachable, it means that there are no active references to that object from any part of the program. The garbage collector identifies such objects during its traversal of the object graph and marks them as candidates for garbage collection. Once an object is marked as garbage, the garbage collector will reclaim the memory occupied by that object, making it available for future memory allocations.
 *
 * After an object is garbage collected, its state is effectively undefined. It no longer exists as a valid Java object, and you cannot interact with it or access its members or methods. The memory previously used by the garbage-collected object is considered as free space and can be reused for other objects in subsequent memory allocations.
 *
 * It's essential to understand that once an object is garbage collected, it has reached the end of its lifecycle, and it cannot be resurrected or made reachable again through normal Java programming. If you find yourself needing to access an object that has been garbage collected, it indicates a design or logic issue in the program, and you should review the code to ensure proper memory management and object lifecycles.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 19.How to write a code that makes an object eligible for garbage collection?
 * In Java, an object becomes eligible for garbage collection when there are no active references to it from any part of the program. That means, if there are no variables, data structures, or other objects pointing to the object, it becomes eligible for garbage collection.
 *
 * To write code that makes an object eligible for garbage collection, you can simply remove all references to that object. Here's an example:
 *
 * java
 * Copy code
 * public class MyClass {
 *     // Class code goes here
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         // Creating an object of MyClass
 *         MyClass obj = new MyClass();
 *
 *         // At this point, 'obj' is a reference to the object of MyClass
 *
 *         // Now, let's make the object eligible for garbage collection
 *         obj = null;
 *
 *         // After setting 'obj' to null, there are no active references to the object
 *         // of MyClass that was created earlier. It becomes eligible for garbage collection.
 *     }
 * }
 * In the example above, we created an object of the MyClass class and assigned it to the variable obj. By setting obj to null, we remove the reference to the object, and there are no other references pointing to that object. As a result, the object becomes eligible for garbage collection.
 *
 * It's important to note that you don't need to explicitly call any method to "delete" or "destroy" the object. Java's automatic garbage collection mechanism will take care of deallocating memory for objects that are no longer reachable. The garbage collector will identify objects that are no longer referenced and free up their memory during its normal operation.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 20.What is difference between State and Strategy Design Pattern?
 * The State pattern and the Strategy pattern are both behavioral design patterns in object-oriented programming, but they serve different purposes and have distinct characteristics:
 *
 * State Design Pattern:
 * Purpose: The State pattern is used to allow an object to change its behavior when its internal state changes. It allows an object to alter its behavior dynamically by changing its internal state without modifying its class.
 * Structure: In the State pattern, the main components are the Context (the object whose behavior changes) and the State (interfaces representing different states) and its concrete implementations (representing specific behaviors based on the state).
 * Usage: The State pattern is beneficial when an object's behavior depends on its internal state, and the object needs to transition between different states and perform different actions accordingly.
 * Strategy Design Pattern:
 * Purpose: The Strategy pattern is used to define a family of algorithms, encapsulate each one as a separate class, and make them interchangeable. It allows the client to choose the appropriate algorithm at runtime without altering its structure.
 * Structure: In the Strategy pattern, the key components are the Context (the object that uses the strategy) and the Strategy (interfaces representing different algorithms) and its concrete implementations (representing specific algorithms).
 * Usage: The Strategy pattern is useful when you want to provide multiple algorithms or strategies for performing a particular task and allow the client to choose the appropriate one based on the situation or requirements.
 * In summary, the main difference between the State and Strategy patterns lies in their intent and usage:
 *
 * State pattern is about managing an object's behavior based on its internal state and allows the object to change its behavior dynamically during runtime based on different states.
 * Strategy pattern is about providing a family of interchangeable algorithms and enabling the client to choose the appropriate algorithm at runtime.
 * Both patterns emphasize the principle of encapsulation and promote flexibility and maintainability in software design. The choice between using the State pattern or the Strategy pattern depends on the specific problem you are trying to solve and the nature of the behavior or algorithms you need to manage.
 *

 *
 *
 * 21.Why need interface if there is Abstract class?
 * Interfaces and abstract classes serve different purposes in object-oriented programming, and each has its own advantages and use cases. Here are some key reasons why interfaces are useful, even when abstract classes are available:
 *
 * Multiple Inheritance of Type: In Java and other languages that support single inheritance, a class can extend only one abstract class. However, a class can implement multiple interfaces. This allows a class to inherit from multiple types, which is a powerful feature when dealing with various behaviors or roles.
 * Contract-Based Programming: Interfaces define contracts or sets of rules that a class must adhere to. They specify what methods a class must implement without specifying how those methods are implemented. This helps in achieving a clear separation of concerns, promotes code reusability, and makes the code more maintainable.
 * Interface Segregation Principle: Interfaces support the principle of "Interface Segregation," which suggests that clients should not be forced to depend on interfaces they do not use. By breaking down functionality into multiple interfaces, you can ensure that clients only implement the specific interfaces they need.
 * Mixins: Interfaces can be used to create mixins, allowing classes to inherit behavior from multiple sources without needing to use multiple inheritance. This is particularly useful when you want to share behavior among unrelated classes.
 * Versioning and Future Compatibility: When using interfaces, you can introduce new methods to an interface without breaking existing implementations. Concrete classes that implement the interface will be required to provide implementations for the new methods. On the other hand, adding new methods to an abstract class may require changes to its existing concrete subclasses.
 * Polymorphism and Loose Coupling: Interfaces enable polymorphism, allowing you to treat objects of different classes that implement the same interface in a uniform way. This leads to looser coupling between components in a system and enhances flexibility in the codebase.
 * Frameworks and Design Patterns: Many design patterns and frameworks rely heavily on interfaces to define contracts and provide a way for developers to extend functionality without altering existing code.
 * In summary, while abstract classes provide a way to share code and establish a hierarchy among related classes, interfaces offer a more flexible and powerful mechanism for defining contracts, achieving multiple inheritance of type, and promoting code modularity and reusability. Both abstract classes and interfaces have their strengths, and they should be used based on the specific needs and design considerations of the application.
 *
 *
 *
 *
 *
 *
 *
 * 22.Why Pointers are Eliminated in Java? (Answer)
 *
 *
 *
 * 23.Explain about Thread Life Cycle? (answer)
 * The thread life cycle represents the various states a thread can go through during its lifetime. In Java, a thread goes through different states as it is created, executed, and eventually terminated. Understanding the thread life cycle is crucial for effective multithreaded programming. The thread life cycle consists of the following states:
 *
 * New:
 * When a thread is created using the new Thread() constructor, it is in the "New" state. In this state, the thread has been created, but it has not yet started running.
 * Runnable:
 * Once the start() method is called on the thread object, the thread moves to the "Runnable" state. In this state, the thread is eligible to be executed, but it may or may not be currently running. The thread scheduler of the underlying operating system decides which threads get CPU time.
 * Running:
 * When the thread scheduler allocates CPU time to the thread, it moves to the "Running" state. In this state, the actual code of the thread is being executed.
 * Blocked (or Waiting):
 * A thread can move to the "Blocked" state when it is waiting for a resource or condition to become available. This can happen due to reasons like waiting for I/O operations or waiting to acquire a lock held by another thread. A thread in the "Blocked" state will not consume CPU time until it moves back to the "Runnable" state.
 * Timed Waiting:
 * A thread can enter the "Timed Waiting" state when it calls certain methods that have a specified time limit, such as Thread.sleep() or Object.wait(). The thread will wait for the specified time before moving back to the "Runnable" state.
 * Terminated (or Dead):
 * A thread completes its execution and enters the "Terminated" state. This can happen when the run() method completes or when an uncaught exception occurs in the thread. Once a thread is in the "Terminated" state, it cannot be started again.
 * It is important to note that the transitions between these states are managed by the Java Virtual Machine (JVM) and the underlying operating system's thread scheduler. The thread scheduler determines which threads get CPU time and when threads should be moved between different states.
 *
 * Multithreaded programming requires careful synchronization and coordination between threads to avoid issues like race conditions and deadlocks. Understanding the thread life cycle helps in writing correct and efficient multithreaded code by knowing when threads can be safely started, stopped, and synchronized.
 *
 *
 *
 *
 *
 * 24.What is meant by Externalisation in Java? (answer)
 * In Java, Externalization is an interface that allows objects to control their own serialization and deserialization process. It is an alternative to the default serialization provided by Java's Serializable interface. Unlike Serializable, which performs serialization and deserialization automatically, Externalization gives the object more control over how its state is written to and read from a stream.
 *
 * To use Externalization, a class needs to implement the Externalizable interface, which declares two methods:
 *
 * void writeExternal(ObjectOutput out): This method is called when the object needs to be serialized. The class should provide its own custom logic to write its state to the ObjectOutput stream.
 * void readExternal(ObjectInput in): This method is called when the object needs to be deserialized. The class should provide its own custom logic to read its state from the ObjectInput stream.
 * Here's an example of using Externalization in Java:
 *
 * java
 * Copy code
 * import java.io.*;
 *
 * class MyClass implements Externalizable {
 *     private int value;
 *     private String text;
 *
 *     public MyClass() {
 *         // Required for Externalizable
 *     }
 *
 *     public MyClass(int value, String text) {
 *         this.value = value;
 *         this.text = text;
 *     }
 *
 *     @Override
 *     public void writeExternal(ObjectOutput out) throws IOException {
 *         out.writeInt(value);
 *         out.writeUTF(text);
 *     }
 *
 *     @Override
 *     public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
 *         value = in.readInt();
 *         text = in.readUTF();
 *     }
 *
 *     @Override
 *     public String toString() {
 *         return "MyClass{" +
 *                 "value=" + value +
 *                 ", text='" + text + '\'' +
 *                 '}';
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) throws IOException, ClassNotFoundException {
 *         MyClass obj1 = new MyClass(42, "Hello");
 *         System.out.println("Original Object: " + obj1);
 *
 *         // Serialize the object to a byte array
 *         ByteArrayOutputStream baos = new ByteArrayOutputStream();
 *         ObjectOutputStream oos = new ObjectOutputStream(baos);
 *         obj1.writeExternal(oos);
 *         oos.close();
 *
 *         // Deserialize the object from the byte array
 *         byte[] byteArray = baos.toByteArray();
 *         ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byteArray));
 *         MyClass obj2 = new MyClass();
 *         obj2.readExternal(ois);
 *         ois.close();
 *
 *         System.out.println("Deserialized Object: " + obj2);
 *     }
 * }
 * Output:
 *
 * vbnet
 * Copy code
 * Original Object: MyClass{value=42, text='Hello'}
 * Deserialized Object: MyClass{value=42, text='Hello'}
 * In this example, the MyClass implements Externalizable and provides custom serialization and deserialization logic using writeExternal and readExternal methods. When an instance of MyClass is serialized and then deserialized, its state is preserved correctly.
 *
 *
 *
 * 25.What is your idea about Reflection Api?
 *
 *
 *
 * 26.What are the different types of Garbage Collection? (answer)
 *There are several different types of Garbage Collection algorithms used by various programming languages and Java Virtual Machines (JVMs). Each algorithm has its strengths and weaknesses, and the choice of garbage collection strategy depends on factors like application requirements, memory size, and performance goals. In the context of Java, the common garbage collection algorithms include:
 *
 * Serial Garbage Collection (Serial GC): This is the simplest garbage collection algorithm, which runs on a single thread and pauses all application threads during garbage collection. It is suitable for small applications or single-threaded environments but may cause significant pauses for large applications.
 * Parallel Garbage Collection (Parallel GC): The Parallel GC is an improvement over the Serial GC, as it uses multiple threads to perform garbage collection, reducing the pause times by running in parallel. It is suitable for multi-core systems and can help improve overall garbage collection performance.
 * Concurrent Mark-Sweep (CMS): Also known as Concurrent GC, this algorithm aims to reduce the pause times further by running most of the garbage collection work concurrently with the application threads. It performs the initial marking and the sweep phases concurrently, but the compact phase may still cause some pause times.
 * G1 Garbage Collection (Garbage-First GC): The G1 GC is designed to provide more predictable and shorter pause times compared to the CMS. It divides the heap into regions and uses multiple threads to perform garbage collection concurrently for different regions. It aims to collect regions with the most garbage first.
 * Z Garbage Collection (ZGC): Introduced in JDK 11, ZGC is designed for low-latency applications. It performs most of the garbage collection work concurrently with the application threads, resulting in very short pause times, typically within a few milliseconds.
 * Shenandoah Garbage Collection (Shenandoah GC): Introduced in JDK 12, Shenandoah GC is another low-latency garbage collection algorithm that aims to keep the pause times short and constant regardless of the heap size.
 * Epsilon Garbage Collector (Epsilon GC): Epsilon GC is a "No-Op" garbage collector introduced in JDK 11. It doesn't perform any garbage collection and is useful in situations where you want to disable garbage collection entirely for testing or specific use cases.
 * The choice of garbage collection algorithm depends on the specific requirements of the application. Applications that prioritize low-latency and short pause times might opt for concurrent garbage collectors like G1, ZGC, or Shenandoah. On the other hand, applications with fewer real-time constraints and more predictable pause times might use the Parallel GC or CMS. The default garbage collector used in recent versions of Java (JDK 9 and later) is G1 GC, which generally provides a good balance between throughput and pause times for most applications.
 *
 *
 *
 *
 *
 *
 *27.What is the difference between Comparable and Comparator Interface? (answer)
 *Both Comparable and Comparator are interfaces in Java that are used for sorting objects in collections, but they serve different purposes:
 *
 * Comparable Interface:
 * The Comparable interface is in the java.lang package.
 * If a class implements the Comparable interface, it indicates that instances of that class have a natural ordering among themselves.
 * The Comparable interface has a single method: int compareTo(T o). This method compares the current object (this) with the specified object (o) and returns a negative integer, zero, or a positive integer, depending on whether the current object is less than, equal to, or greater than the specified object, respectively.
 * The compareTo method is used for the natural ordering of objects, and it is the basis for sorting collections using methods like Collections.sort() and Arrays.sort().
 * Comparator Interface:
 * The Comparator interface is in the java.util package.
 * The Comparator interface provides a way to define custom comparison logic for objects that do not have a natural ordering or when you want to use a different sorting order than the natural one.
 * The Comparator interface has a single method: int compare(T o1, T o2). This method takes two objects (o1 and o2) as arguments and returns a negative integer, zero, or a positive integer, depending on whether o1 is less than, equal to, or greater than o2, respectively.
 * With Comparator, you can create multiple sorting rules for the same class. It allows you to sort objects based on different criteria without modifying the original class or using its natural ordering.
 * In summary, the Comparable interface is used for defining natural ordering of objects, while the Comparator interface is used for defining custom ordering logic. If a class implements Comparable, its natural ordering is defined, and it can be directly sorted using standard sorting methods. On the other hand, if you want to sort objects based on custom criteria or if the class does not have a natural ordering, you can use a separate Comparator to provide the sorting logic.
 *
 *





 * 28.Do you have any work experience in Executor Services? (answer)
 *Executor Services are part of the Java Concurrency API, and they provide a higher-level abstraction for managing thread execution in concurrent
 * applications. They allow you to submit tasks for execution and handle the threading details, such as creating and managing threads, on your behalf.
 *
 *
 *
 *
 *
 *

 * 29.Difference between Callable and Runnable and Future? (answer)
 * In Java, Callable, Runnable, and Future are interfaces that are related to multithreading and concurrent programming. Each interface serves a different purpose in managing and executing tasks in a concurrent environment. Here's a brief explanation of each:
 *
 * Runnable:
 * Runnable is a functional interface introduced in Java 1.0 and is part of the java.lang package. It represents a task that can be executed concurrently by a thread. The Runnable interface has a single method run() that does not take any arguments and does not return any value. To execute a Runnable task, you need to create a Thread and pass the Runnable instance to its constructor.
 * java
 * Copy code
 * public interface Runnable {
 *     void run();
 * }
 * Callable:
 * Callable is a functional interface introduced in Java 1.5 as part of the java.util.concurrent package. It is similar to Runnable, but it allows a task to return a result and throw checked exceptions. The Callable interface has a single method call() that returns a value of a specified type (the result of the computation). To execute a Callable task, you need to use an ExecutorService, which is capable of executing Callable tasks and returning Future objects representing the result.
 * java
 * Copy code
 * public interface Callable<V> {
 *     V call() throws Exception;
 * }
 * Future:
 * Future is an interface introduced in Java 1.5 as part of the java.util.concurrent package. It represents the result of an asynchronous computation (such as the result of a Callable task). The Future interface provides methods to check if the computation is complete, retrieve the result, or cancel the computation. It allows you to manage the status and progress of a task submitted to an ExecutorService.
 * java
 * Copy code
 * public interface Future<V> {
 *     boolean cancel(boolean mayInterruptIfRunning);
 *     boolean isCancelled();
 *     boolean isDone();
 *     V get() throws InterruptedException, ExecutionException;
 *     V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException;
 * }
 * In summary, the main differences are:
 *
 * Runnable is the simplest interface that represents a task to be executed by a thread, but it does not return any result.
 * Callable is an extension of Runnable that allows a task to return a result and throw checked exceptions.
 * Future represents the result of an asynchronous computation and provides methods to check the status and retrieve the result of the computation. It is used with Callable tasks executed through an ExecutorService.
 *
 *
 *

 *
 * 30.What are the Java 8 Features? (answer)
 *
 *
 *
 *
 *

 * 31.What is the advancement made in Hashmap in Java 8? (Answer)
 * In Java 8, there were several advancements made in the HashMap class to improve its performance, memory efficiency, and usability. These advancements are part of the ongoing efforts to optimize data structures and improve the overall performance of Java collections. Here are some of the key advancements made in HashMap in Java 8:
 *
 * Tree-based Buckets (Balanced Trees):
 * In Java 8, when the number of elements in a bucket (chain of entries with the same hash) exceeds a certain threshold, HashMap switches from a linked list to a balanced tree to store these elements. This improves the worst-case performance of certain operations, such as lookup and removal, from O(n) to O(log n).
 * Enhanced Hashing (MurmurHash):
 * In Java 8, HashMap uses a more efficient hash function called MurmurHash. This hash function has better distribution properties, which reduces the likelihood of hash collisions and improves the performance of the HashMap.
 * Reduced Memory Overhead:
 * In Java 8, the memory overhead of HashMap is reduced. The new implementation uses fewer objects and reduces the space required to store each entry in the map.
 * computeIfAbsent and computeIfPresent Methods:
 * Java 8 introduced new methods in the HashMap class, such as computeIfAbsent and computeIfPresent. These methods allow you to perform computations on the map's values if a key is absent or present, respectively. They help in avoiding unnecessary manual handling of null values.
 * forEach Method:
 * The HashMap class in Java 8 introduced a forEach method that allows you to iterate over the entries in the map and perform an action on each entry. It provides a more concise and efficient way to perform operations on all elements in the map.
 * merge Method:
 * Java 8 added a merge method to the HashMap class. The merge method combines the values of two keys using a provided function. If the key does not exist, it will add a new key-value pair to the map.
 * These advancements in the HashMap implementation were aimed at improving performance and memory efficiency, especially for large collections. As a result, Java 8's HashMap provides better performance and reduced memory usage compared to earlier versions. It is important to note that these improvements are part of the overall effort to enhance Java collections and have been carried forward in subsequent Java versions.
 *
 *
 *

 *
 * 32.Do you have any idea about Thread Dump and how is it created?
 * What is a Thread Dump?
 * A thread dump is a snapshot of the current state of all threads running in a Java Virtual Machine (JVM). It provides valuable information about the threads' status, including which threads are running, waiting, or blocked, and their call stacks (the methods they are currently executing). Thread dumps are useful for diagnosing and troubleshooting performance issues, deadlocks, and other thread-related problems in Java applications.
 *
 * How is a Thread Dump Created?
 * There are several ways to create a thread dump:
 *
 * Sending a Signal to the JVM:
 * On Unix-based systems, you can send the QUIT signal to the Java process. This signal instructs the JVM to print a thread dump to the standard output. For example, using the kill command:
 * bash
 * Copy code
 * kill -QUIT <PID>
 * Replace <PID> with the process ID of the running Java application.
 * Using JConsole or JVisualVM:
 * JConsole and JVisualVM are monitoring tools that come with the Java Development Kit (JDK). They allow you to connect to a running Java process and obtain a thread dump interactively. You can access the thread dump by selecting the Threads tab in either tool and clicking the "Thread Dump" button.
 * Using jstack Utility:
 * The jstack command-line utility is part of the JDK and can be used to obtain a thread dump. Simply run the jstack command with the process ID of the Java application:
 * php
 * Copy code
 * jstack <PID>
 * The utility will print the thread dump to the standard output.
 * Programmatically Generating Thread Dumps:
 * In your Java application code, you can programmatically generate thread dumps using the Thread class and Thread.getAllStackTraces() method. This approach can be useful when you want to take thread dumps at specific points in your application's execution or based on certain conditions.
 * java
 * Copy code
 * Map<Thread, StackTraceElement[]> threadMap = Thread.getAllStackTraces();
 * for (Map.Entry<Thread, StackTraceElement[]> entry : threadMap.entrySet()) {
 *     Thread thread = entry.getKey();
 *     StackTraceElement[] stackTrace = entry.getValue();
 *     // Process thread information and stack trace as needed
 * }
 * Once you have obtained the thread dump, you can analyze it to identify potential issues in your application's concurrency and threading behavior. Thread dumps can reveal thread contention, deadlocks, long-running or stuck threads, and other performance-related problems. They are valuable tools for diagnosing and resolving complex threading issues in Java applications.
 *
 *
 *
 *
 *
 * 33.What are the different types of Thread pool creation in Concurrency Control? (Answer)
 * In Java's Concurrency Control, there are several ways to create thread pools to manage concurrent execution of tasks efficiently. A thread pool is a pool of pre-initialized worker threads that are ready to execute tasks concurrently. It helps avoid the overhead of creating and destroying threads for each task, leading to better performance and resource management. Here are the different types of thread pool creation approaches:
 *
 * Executor Framework:
 * The Executor framework is part of Java's java.util.concurrent package and provides a high-level abstraction for managing thread execution. It allows you to create different types of thread pools using factory methods in the Executors class. Some common thread pool creation methods are:
 * newFixedThreadPool(int nThreads): Creates a fixed-size thread pool with a specified number of threads.
 * newCachedThreadPool(): Creates a thread pool that dynamically adjusts the number of threads based on the workload.
 * newSingleThreadExecutor(): Creates a single-threaded executor, which is useful for tasks that need sequential execution.
 * newScheduledThreadPool(int corePoolSize): Creates a thread pool capable of scheduling tasks to run after a delay or at fixed intervals.
 * ThreadPoolExecutor:
 * The ThreadPoolExecutor class is a more customizable option for creating thread pools, providing fine-grained control over the thread pool's configuration. You can define core pool size, maximum pool size, keep-alive time, and the task queue, allowing for more precise tuning of the thread pool to suit your application's requirements.
 * ForkJoinPool:
 * The ForkJoinPool class, also part of the java.util.concurrent package, is specifically designed for work-stealing algorithms, which are useful for divide-and-conquer tasks. It allows for efficient processing of tasks with balanced workloads, such as recursive tasks.
 * ManagedExecutorService:
 * Introduced in Java EE 7, the ManagedExecutorService is part of the Java EE Concurrency Utilities (JSR 236). It provides managed thread pools that can be used in Java EE applications, offering features like integration with the container's lifecycle and context propagation.
 * Choosing the appropriate type of thread pool depends on your application's requirements and the nature of tasks you want to execute concurrently. For most general use cases, the Executor framework's factory methods provide a simple and effective way to create thread pools. If you need more customization or have specific requirements, you can use the ThreadPoolExecutor or ForkJoinPool classes. In Java EE applications, you can consider using ManagedExecutorService for managed thread pool usage.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 34.Difference between Volatile and Transient Keyword? (Answer)
 * volatile and transient are two different keywords in Java that serve different purposes:
 *
 * Volatile:
 * volatile is a keyword that is used to indicate that a variable's value may be modified by multiple threads. When a variable is declared as volatile, the Java Memory Model guarantees that any thread reading the variable will see the most recent value written to it by any other thread.
 * It ensures that changes made by one thread to the volatile variable are immediately visible to other threads, preventing potential data visibility and consistency issues in multi-threaded environments.
 * volatile is typically used for variables that are shared among multiple threads and are frequently updated without any dependency on their previous values. It does not provide atomicity for compound operations (such as incrementing a counter), so if such operations need to be performed atomically, additional synchronization mechanisms like synchronized or java.util.concurrent classes should be used.
 * Transient:
 * transient is a keyword that is used to indicate that a variable should not be serialized when an object is converted into a stream of bytes (serialization) and then restored back to an object (deserialization).
 * When an object is serialized, all of its non-transient fields are written to the output stream. However, if a field is marked as transient, its value will not be included in the serialization process.
 * This is useful when certain fields contain sensitive information that should not be saved to persistent storage or when certain fields are derived/calculated and don't need to be serialized and restored.
 * When an object is deserialized, transient fields are initialized to their default values (e.g., null for object references, 0 for numeric types).
 * To summarize, volatile is used to ensure visibility and consistency of variable values among multiple threads, whereas transient is used to prevent certain fields from being serialized during the object serialization process. They are entirely unrelated in their functionality and usage.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 35.Difference between Collection and Collections? (Answer)
 * Collection and Collections are two different concepts in Java related to working with groups of elements, but they serve different purposes:
 *
 * Collection:
 * Collection is an interface in the Java Collections Framework (JCF) that represents a group of elements, also known as a collection. It is part of the java.util package.
 * It is the root interface of the collections hierarchy and defines common methods that are shared by all the collection classes, such as add, remove, size, contains, etc.
 * Implementations of the Collection interface include classes like ArrayList, LinkedList, HashSet, TreeSet, etc., which provide different ways of organizing and storing elements.
 * Collections:
 * Collections (with an 's') is a utility class in the Java Collections Framework (JCF) that contains various static methods to work with collections. It is also part of the java.util package.
 * The Collections class provides several useful methods for performing common operations on collections, such as sorting, searching, filling, reversing, etc.
 * It is not an interface like Collection; instead, it is a final class with static utility methods. Therefore, it cannot be instantiated, and all its methods are accessed using the class name.
 * Here's a quick summary of the differences:
 *
 * Collection: An interface representing a group of elements with common methods shared by all collection classes.
 * Collections: A utility class with static methods to perform various operations on collections, such as sorting and searching.
 * In summary, while Collection is the root interface for collections in Java, Collections is a utility class containing static methods to work with collections and provides helpful methods for common collection-related tasks.
 *
 *
 *
 *
 *

 * 36.What is Serialization? How Can we avoid Serialization of any fields or methods in a class? (Answer)
 * Serialization is the process of converting an object into a stream of bytes so that it can be easily stored, transmitted, or reconstructed into an object later. In Java, serialization is used to save the state of an object into a file or transfer it over a network. The serialized data can then be deserialized to recreate the object with the same state as the original.
 *
 * To avoid serialization of specific fields or methods in a class, you can use the transient keyword. When you mark a field as transient, it will not be included in the serialization process. Similarly, you can mark methods as transient to prevent their serialization.
 *
 * Here's how you can use the transient keyword to avoid serialization of fields and methods:
 *
 * Avoid Serialization of Fields:
 * If you have a field in a class that you want to exclude from the serialization process, simply mark it as transient. When the object is serialized, the transient field will not be saved to the output stream.
 * java
 * Copy code
 * public class MyClass implements Serializable {
 *     private int nonTransientField;  // This field will be serialized.
 *     private transient String transientField; // This field will NOT be serialized.
 * }
 * Avoid Serialization of Methods:
 * In Java, methods cannot be marked as transient directly. Methods are not part of the object's state, so there's no need to exclude them from serialization. Only fields that represent the object's state need to be marked as transient to avoid serialization.
 * It's important to note that transient fields will be initialized to their default values when the object is deserialized. For example, for object references, the transient field will be set to null, and for numeric types, it will be set to 0.
 *
 * Keep in mind that using the transient keyword should be done with care. Only use it for fields or data that you don't need to persist or transfer when serializing and deserializing objects.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 37.What is the use of Optional Class?
 *The Optional class in Java was introduced in Java 8 as part of the java.util package. It is designed to help handle situations where a value may or may not be present, thereby reducing the likelihood of null pointer exceptions and providing a more expressive and safer way to deal with potentially absent values.
 *
 * The main use of the Optional class is to represent an optional value. It can contain either a non-null value or be empty (representing the absence of a value). This can be beneficial in several scenarios:
 *
 * Avoiding Null Checks:
 * Instead of using explicit null checks, you can use Optional to wrap a value and then handle it using methods provided by the class. This helps make your code more concise and less prone to null pointer exceptions.
 * Clear Indication of Absence:
 * The use of Optional makes it clear that a method may return an absent value, making the code more self-documenting and reducing the need for additional comments or documentation.
 * Chaining and Composing Operations:
 * Optional provides methods to chain and compose operations on the optional value, such as map, filter, orElse, orElseGet, and orElseThrow. These methods allow you to perform various actions on the optional value if it is present or provide a default value or behavior if the value is absent.
 * Forcing the Handling of Absent Values:
 * When using Optional, you are encouraged to handle the possibility of absent values explicitly. By using methods like orElse, you can provide a default value to use when the value is absent, ensuring that your code always has a well-defined behavior.
 * Here's a simple example of using Optional to handle a potentially absent value:
 *
 * java
 * Copy code
 * import java.util.Optional;
 *
 * public class OptionalExample {
 *     public static void main(String[] args) {
 *         String nullableValue = null;
 *
 *         Optional<String> optionalValue = Optional.ofNullable(nullableValue);
 *
 *         // Handle the optional value using various methods
 *         if (optionalValue.isPresent()) {
 *             System.out.println("Value is present: " + optionalValue.get());
 *         } else {
 *             System.out.println("Value is absent");
 *         }
 *
 *         // Using orElse to provide a default value
 *         String result = optionalValue.orElse("Default Value");
 *         System.out.println("Result: " + result);
 *
 *         // Using orElseGet to provide a default value with a supplier function
 *         String resultFromSupplier = optionalValue.orElseGet(() -> "Default Value from Supplier");
 *         System.out.println("Result from Supplier: " + resultFromSupplier);
 *     }
 * }
 * In this example, we create an Optional from a nullable value and then use various methods to handle its presence or absence and provide default values when needed.
 *
 * Overall, the Optional class encourages a more robust and safer programming style when dealing with optional or potentially absent values, making code more reliable and easier to understand.
 *
 *
 *
 *
 *
 *
 *
 *
 * 38.Difference between Map and FlatMap?
 * Both map and flatMap are functional programming operations commonly used in Java 8 and later versions. They are methods available on streams, which are sequences of elements that can be processed in a functional-style manner. While both operations are used to transform elements in a stream, they serve different purposes:
 *
 * map:
 * The map operation is used to apply a function to each element in the stream and transform it into another value. It returns a new stream containing the transformed elements in the same order as the original stream.
 * The transformation function takes one input element and returns a single output element. The resulting stream will have the same number of elements as the original stream.
 * Here's an example of using map to transform a list of integers by multiplying each element by 2:
 * java
 * Copy code
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
 * List<Integer> doubledNumbers = numbers.stream()
 *     .map(num -> num * 2)
 *     .collect(Collectors.toList()); // Output: [2, 4, 6, 8, 10]
 * flatMap:
 * The flatMap operation is used to flatten nested sequences in a stream of elements. It takes a function that returns a stream as input and then flattens the resulting streams into a single stream of elements.
 * The transformation function takes one input element and returns a stream of zero or more output elements. The resulting stream will contain the elements from all the nested streams.
 * Here's an example of using flatMap to flatten a list of lists into a single list:
 * java
 * Copy code
 * List<List<Integer>> nestedNumbers = Arrays.asList(
 *     Arrays.asList(1, 2, 3),
 *     Arrays.asList(4, 5),
 *     Arrays.asList(6, 7, 8)
 * );
 *
 * List<Integer> flattenedNumbers = nestedNumbers.stream()
 *     .flatMap(Collection::stream)
 *     .collect(Collectors.toList()); // Output: [1, 2, 3, 4, 5, 6, 7, 8]
 * In summary:
 *
 * map: Transforms each element in the stream using a one-to-one transformation function. The resulting stream has the same number of elements as the original stream.
 * flatMap: Transforms each element in the stream using a one-to-many transformation function (which returns a stream). The resulting stream is a single stream containing all the elements from the nested streams.
 * Both map and flatMap are powerful tools in functional programming for manipulating data in streams and are commonly used to transform and restructure data in Java applications.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 39.What do you understand about Functional Interface and some functional Interfaces? (answer)
 *
 *
 *
 *
 *
 *
 *
 * 40.What are the four main Functional Interface used in Java 8? (answer)
 *In Java 8, the four main functional interfaces, which are part of the java.util.function package, serve as the foundation for functional programming and lambda expressions. These functional interfaces are used to represent different types of lambda expressions and method references. Each functional interface has a single abstract method, known as a functional method, and can be used with lambda expressions or method references to implement functional programming paradigms. The four main functional interfaces are:
 *
 * Function<T, R>:
 * Represents a function that takes an argument of type T and produces a result of type R.
 * The functional method is R apply(T t).
 * It is often used for one-to-one mappings or transformations.
 * Predicate<T>:
 * Represents a function that takes an argument of type T and returns a boolean result.
 * The functional method is boolean test(T t).
 * It is often used for filtering or testing conditions.
 * Consumer<T>:
 * Represents a function that takes an argument of type T and performs an action on it without returning any result.
 * The functional method is void accept(T t).
 * It is often used for operations that consume or modify elements.
 * Supplier<T>:
 * Represents a function that does not take any arguments and produces a result of type T.
 * The functional method is T get().
 * It is often used for providing or generating values.
 * These functional interfaces provide a simple way to use lambda expressions and method references in Java 8, making it easier to work with functional-style programming and enabling concise and expressive code. In combination with streams, the use of these functional interfaces greatly enhances the readability and maintainability of code in modern Java applications.
 *
 *
 *
 *
 *
 *
 *
 * 41.What do you understand about Marker Interface and some example for Marker Interface? (answer)
 * A marker interface in Java is an interface that does not declare any method (i.e., it has no abstract methods). Its primary purpose is to mark or tag a class as having a specific property or behavior. The marker interface pattern is a design pattern where a class implements a marker interface to indicate that it possesses certain characteristics or features.
 *
 * By implementing a marker interface, a class can communicate to other parts of the code or the Java runtime system that it has some special behavior or should be treated differently. Marker interfaces are often used to enable additional functionality or to enable certain optimizations.
 *
 * Some key points about marker interfaces:
 *
 * No Abstract Methods: As mentioned earlier, a marker interface does not have any abstract methods. It serves as a "marker" rather than providing any behavior.
 * Presence of a Marker: When a class implements a marker interface, it indicates that the class possesses the characteristic associated with that marker interface.
 * Inheritance of Marker: If a class implements a marker interface, its subclasses also inherit the marker characteristic.
 * Usage in Libraries and Frameworks: Marker interfaces are commonly used in libraries and frameworks to enable specific features or behavior based on the presence of the marker interface.
 * Example of a Marker Interface:
 *
 * A classic example of a marker interface in Java is the Serializable interface. The Serializable interface is present in the java.io package and does not declare any methods. Classes that implement the Serializable interface indicate that their objects can be converted into a stream of bytes for serialization and deserialization. The Java runtime and libraries use this marker interface to handle object serialization automatically.
 *
 * java
 * Copy code
 * import java.io.Serializable;
 *
 * // A class implementing the Serializable marker interface
 * public class Person implements Serializable {
 *     // Class implementation
 * }
 * Here, the Person class implements the Serializable interface, indicating that objects of this class can be serialized and deserialized.
 *
 * It's essential to use marker interfaces judiciously as they can affect the design and readability of the code. In modern Java, marker interfaces are not as prevalent due to the availability of annotations, which offer more flexibility and allow for metadata to be attached to classes and methods. However, marker interfaces remain a valid and sometimes useful technique in specific scenarios, particularly for compatibility with legacy code or when working with libraries and frameworks that utilize them.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 42.What is the difference between Fail-fast and Fail-Safe, Throw and Throws, StringBuffer and StringBuilder,
 * Shallow copy and Deep copy, Finally vs final vs Finalize, String pool vs Heap?
 *
 * 1. Fail-fast vs. Fail-safe:
 *
 * Fail-fast and fail-safe are two different strategies for handling concurrent modifications in data structures.
 * Fail-fast: When an underlying data structure (like a collection) is modified while an iterator is traversing it, fail-fast iterators detect the
 * concurrent modification and immediately throw a ConcurrentModificationException, indicating that the data structure has been structurally modified
 * during iteration.
 * Fail-safe: In contrast, fail-safe iterators create a copy of the data structure or use internal mechanisms to avoid concurrent modification issues.
 * They allow modifications during iteration and do not throw exceptions but might not reflect all the changes made during iteration.
 * 2. Throw vs. Throws:
 *
 * throw: It is used to explicitly throw an exception in Java. It is followed by an exception instance or a new exception object.
 * throws: It is used in the method signature to indicate that the method can potentially throw a checked exception. It specifies the types of exceptions
 * that the method might throw.
 *
 * 3. StringBuffer vs. StringBuilder:
 *
 * Both StringBuffer and StringBuilder are used to manipulate strings, but they differ in their synchronization behavior.
 * StringBuffer: It is synchronized and thread-safe, which means it can be safely used in multi-threaded environments.
 * It is slower due to the overhead of synchronization.
 * StringBuilder: It is not synchronized and not thread-safe, making it faster and more efficient in single-threaded scenarios.
 * It is recommended for use in single-threaded contexts.
 * 4. Shallow Copy vs. Deep Copy:
 *
 * Shallow Copy: A shallow copy creates a new object and copies the contents of the original object to the new object. However, if the original object
 * contains references to other objects, only the references are copied, not the referred objects. Both the original and copied objects point to the same
 * referenced objects.
 * Deep Copy: A deep copy creates a new object and copies the contents of the original object along with all the objects referenced by the original object.
 * It creates copies of the entire object hierarchy, recursively.
 *
 * 5. Finally vs. final vs. Finalize:
 *
 * finally: It is a block used in try-catch statements and ensures that a block of code executes regardless of whether an exception is thrown or not. It is typically used to release resources or perform cleanup operations.
 * final: It is a keyword used to declare constants (immutable variables) or to make a class, method, or variable non-extendable or non-overridable.
 * finalize: It is a method defined in the Object class. It is called by the garbage collector when an object is about to be garbage collected. It is used to perform cleanup actions before the object is reclaimed by the memory management system.
 * 6. String Pool vs. Heap:
 *
 * String Pool: The string pool is a special area in the Java heap where string literals are stored. When a string literal is created in the code,
 * it is placed in the string pool, and subsequent references to the same string literal will reuse the same instance from the pool, saving memory.
 * Heap: The heap is a region of memory in the Java runtime that is used for dynamic memory allocation.
 * Objects created at runtime are stored in the heap. Unlike the string pool, objects in the heap are not automatically reused or shared unless explicitly
 * programmed to do so.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 43.When creating a string with new keyword where the object of created? (answer)
 * When you create a string using the new keyword in Java, the object is created on the heap. The new keyword is used to explicitly allocate memory for
 * an object and returns a reference to that object. Strings created using new are mutable, meaning their values can be changed after creation.
 *
 * Here's an example of creating a string using the new keyword:
 *
 * java
 * Copy code
 * String str = new String("Hello");
 * In this example, the new keyword is used to create a new string object with the value "Hello".
 * The object is allocated on the heap, and the variable str holds a reference to that object.
 *
 * It's important to note that using the new keyword to create strings is less common than creating strings using string literals (e.g., "Hello").
 * String literals are automatically stored in the string pool, a special area of memory in the heap, and Java optimizes the use of string literals to avoid
 * unnecessary duplication. This makes string literals more memory-efficient and faster to access compared to strings created with new.
 * Therefore, it is generally recommended to use string literals whenever possible, and the new keyword for creating strings is typically used in specific
 * scenarios where mutability is required.
 *
 *
 *
 *
 *
 *
 * 44.Idea about var args, Hashcode and Equals, Streams vs Collections?
 * Sure! Here's an overview of var args, hashCode and equals, and the difference between Streams and Collections:
 *
 * var args:
 * In Java, var args (variable-length argument lists) allow you to pass a variable number of arguments of the same type to a method. It is denoted by an ellipsis (...) after the parameter type in the method's parameter list. With var args, you can pass zero or more arguments of the specified type to the method.
 * Example:
 *
 * java
 * Copy code
 * public void printNumbers(int... numbers) {
 *     for (int num : numbers) {
 *         System.out.print(num + " ");
 *     }
 * }
 *
 * // Usage
 * printNumbers(1, 2, 3); // Output: 1 2 3
 * printNumbers();        // Output: (no output, as no arguments provided)
 * hashCode and equals:
 * hashCode and equals are methods defined in the Object class, which is the superclass of all Java classes. They are used to compare and identify objects.
 * hashCode: The hashCode() method returns an integer value (a hash code) that represents the object. It is used for efficient hashing-based data structures like hash tables, which allow quick lookup and retrieval of objects based on their hash codes. In Java, if two objects are equal (as per the equals method), their hash codes must also be equal. However, the reverse is not necessarily true.
 * equals: The equals() method is used to compare the content of two objects to check if they are equal. It is used for general object comparison and is often overridden in custom classes to provide meaningful comparison based on specific attributes of the object.
 * Example:
 *
 * java
 * Copy code
 * public class Person {
 *     private String name;
 *     private int age;
 *
 *     // Constructors, getters, setters, etc. (not shown for brevity)
 *
 *     @Override
 *     public boolean equals(Object obj) {
 *         if (this == obj) return true;
 *         if (obj == null || getClass() != obj.getClass()) return false;
 *         Person person = (Person) obj;
 *         return age == person.age && Objects.equals(name, person.name);
 *     }
 *
 *     @Override
 *     public int hashCode() {
 *         return Objects.hash(name, age);
 *     }
 * }
 * Streams vs Collections:
 * Streams and Collections are both used for data manipulation in Java, but they have some key differences:
 * Collections: Collections are data structures that hold a collection of objects. They are used for storing, managing, and accessing data elements. Common examples of collections include List, Set, and Map. Collections are designed to work with finite, fixed-size data sets.
 * Streams: Streams are a new addition to Java in Java 8. They are a sequence of elements that can be processed in a functional-style manner. Streams are designed to work with potentially infinite or large data sets and allow operations like filtering, mapping, and reducing. They are based on functional programming concepts and promote a more declarative and concise code style.
 * Example:
 *
 * java
 * Copy code
 * // Collection
 * List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
 * names.forEach(System.out::println); // Output: Alice Bob Charlie
 *
 * // Stream
 * List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
 * names.stream()
 *      .filter(name -> name.startsWith("A"))
 *      .forEach(System.out::println); // Output: Alice
 * In summary, var args allows passing a variable number of arguments to a method, hashCode and equals are used for object comparison and identification, and Streams and Collections serve different purposes for data manipulation in Java.
 *
 *
 *
 *
 *
 *
 *
 *
 * 45.Try with Resources, Object class Methods, Default size of ArrayList etc.?
 *Try-with-Resources:
 * Try-with-resources is a feature introduced in Java 7 that simplifies resource management, such as closing streams or connections after their operations are completed. It ensures that resources are automatically closed at the end of the block, even if an exception occurs.
 * Example of using try-with-resources with a BufferedReader:
 *
 * java
 * Copy code
 * import java.io.BufferedReader;
 * import java.io.FileReader;
 * import java.io.IOException;
 *
 * public class TryWithResourcesExample {
 *     public static void main(String[] args) {
 *         try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
 *             String line;
 *             while ((line = reader.readLine()) != null) {
 *                 System.out.println(line);
 *             }
 *         } catch (IOException e) {
 *             e.printStackTrace();
 *         }
 *     }
 * }
 * Object Class Methods:
 * The Object class is the root of the class hierarchy in Java, and every class implicitly extends it. Some of the important methods defined in the Object class are:
 * equals(Object obj): Compares the content of two objects for equality.
 * hashCode(): Returns a hash code value for the object.
 * toString(): Returns a string representation of the object.
 * getClass(): Returns the runtime class of an object.
 * Default size of ArrayList:
 * When you create an ArrayList without specifying an initial capacity, it has a default initial capacity of 10 elements. If you add more elements beyond this capacity, the ArrayList will automatically resize itself to accommodate the new elements.
 * Example:
 *
 * java
 * Copy code
 * import java.util.ArrayList;
 *
 * public class ArrayListExample {
 *     public static void main(String[] args) {
 *         ArrayList<Integer> numbers = new ArrayList<>();
 *         System.out.println("Default initial capacity: " + numbers.size()); // Output: 0
 *
 *         for (int i = 1; i <= 15; i++) {
 *             numbers.add(i);
 *         }
 *
 *         System.out.println("Current size after adding 15 elements: " + numbers.size()); // Output: 15
 *     }
 * }
 * In this example, we create an ArrayList of integers without specifying an initial capacity. It starts with a default size of 0 and automatically increases its capacity when elements are added beyond the initial capacity (10 in this case). When we add 15 elements, the size of the ArrayList becomes 15.
 *
 *
 *
 *
 *
 *
 *
 *
 * 46.What will happen if we try to remove any element from list without adding into it? eg List.remove(0) ?
 *If you try to remove an element from a list without adding any elements to it, i.e., the list is empty, the remove() method will throw an IndexOutOfBoundsException.
 *
 * Here's an example to demonstrate this behavior:
 *
 * java
 * Copy code
 * import java.util.ArrayList;
 * import java.util.List;
 *
 * public class ListRemoveExample {
 *     public static void main(String[] args) {
 *         List<String> list = new ArrayList<>();
 *
 *         try {
 *             list.remove(0); // Attempting to remove an element from an empty list
 *         } catch (IndexOutOfBoundsException e) {
 *             System.out.println("Caught IndexOutOfBoundsException: " + e.getMessage());
 *         }
 *     }
 * }
 * Output:
 *
 * csharp
 * Copy code
 * Caught IndexOutOfBoundsException: Index 0 out of bounds for length 0
 * As you can see, an IndexOutOfBoundsException is thrown because there are no elements in the list, and trying to remove an element at index 0 (or any other index) is not possible in this case. To avoid this exception, make sure to check if the list is not empty before attempting to remove elements.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 47.what will happen if we execute the following statement

 * int a = Integer.parseInt(“text”); (Answer)
 * If you execute the statement int a = Integer.parseInt("text");, it will throw a NumberFormatException because the parseInt() method attempts to convert the provided string ("text") into an integer, but the string does not represent a valid integer value.
 *
 * Here's an example to demonstrate this behavior:
 *
 * java
 * Copy code
 * public class ParseIntExample {
 *     public static void main(String[] args) {
 *         try {
 *             int a = Integer.parseInt("text");
 *             System.out.println("Parsed integer: " + a);
 *         } catch (NumberFormatException e) {
 *             System.out.println("Caught NumberFormatException: " + e.getMessage());
 *         }
 *     }
 * }
 * Output:
 *
 * lua
 * Copy code
 * Caught NumberFormatException: For input string: "text"
 * As you can see, the Integer.parseInt("text") call throws a NumberFormatException with the message "For input string: "text"" because "text" cannot be parsed into an integer. To avoid this exception, ensure that the input string contains a valid representation of an integer before calling parseInt().
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 48.Describe and compare fail-fast and fail-safe iterators. Give examples.
 * Fail-Fast and Fail-Safe are two different strategies used in dealing with iterators when the underlying collection is modified during iteration. Let's describe and compare them:
 *
 * Fail-Fast Iterators:
 * Fail-Fast iterators immediately throw a ConcurrentModificationException if the underlying collection is structurally modified while iterating over it. The fail-fast approach detects concurrent modifications and ensures that the iteration does not continue with a potentially inconsistent state of the collection.
 * Example of Fail-Fast Iterator:
 *
 * java
 * Copy code
 * import java.util.ArrayList;
 * import java.util.Iterator;
 * import java.util.List;
 *
 * public class FailFastExample {
 *     public static void main(String[] args) {
 *         List<String> list = new ArrayList<>();
 *         list.add("Item1");
 *         list.add("Item2");
 *         list.add("Item3");
 *
 *         Iterator<String> iterator = list.iterator();
 *         while (iterator.hasNext()) {
 *             String item = iterator.next();
 *             System.out.println(item);
 *             // Concurrent modification
 *             list.remove(item); // Throws ConcurrentModificationException
 *         }
 *     }
 * }
 * Output:
 *
 * php
 * Copy code
 * Item1
 * Exception in thread "main" java.util.ConcurrentModificationException
 * 	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
 * 	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
 * 	at FailFastExample.main(FailFastExample.java:13)
 * Fail-Safe Iterators:
 * Fail-Safe iterators create a copy of the underlying collection and iterate over that copy, thus avoiding the possibility of ConcurrentModificationException. The fail-safe approach ensures that the original collection is not affected by any modifications made during iteration.
 * Example of Fail-Safe Iterator:
 *
 * java
 * Copy code
 * import java.util.Iterator;
 * import java.util.concurrent.ConcurrentHashMap;
 *
 * public class FailSafeExample {
 *     public static void main(String[] args) {
 *         ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
 *         map.put("A", 1);
 *         map.put("B", 2);
 *         map.put("C", 3);
 *
 *         Iterator<String> iterator = map.keySet().iterator();
 *         while (iterator.hasNext()) {
 *             String key = iterator.next();
 *             System.out.println(key + " : " + map.get(key));
 *             // Concurrent modification
 *             map.put("D", 4); // No ConcurrentModificationException
 *         }
 *     }
 * }
 * Output:
 *
 * yaml
 * Copy code
 * A : 1
 * B : 2
 * C : 3
 * In this example, the fail-safe iterator is used with the ConcurrentHashMap. The iterator does not throw any ConcurrentModificationException, and the newly added key-value pair "D" : 4 is also printed in the output.
 *
 * Comparison:
 *
 * Fail-Fast iterators detect concurrent modifications during iteration and immediately throw a ConcurrentModificationException, ensuring that the iteration stops with an exception.
 * Fail-Safe iterators make a copy of the underlying collection and iterate over that copy, avoiding ConcurrentModificationException. They ensure that the original collection is not affected by any modifications during iteration.
 * The choice between fail-fast and fail-safe iterators depends on the requirements and expected behavior in concurrent scenarios. Fail-safe iterators are generally safer to use in concurrent environments, but they may not reflect the latest changes in the original collection. Fail-fast iterators provide more immediate feedback about concurrent modifications but require careful handling to avoid exceptions.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 49.What is the difference between Hashmap vs hashTable , which one is synchronized?
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 50.Difference between Hashmap vs concurrenthashmap and the follow-up question on how they work internally etc.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 51.How hashmap works ?
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 52.How to create custom immutable class ?
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 53.What are the in built immutable classes in java ?
 *
 *
 *
 *
 *
 *
 *
 *
 * 54.Difference between Aggregation vs composition ?
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 55.How to create immutable map in java on which we can’t modify after adding the data ?
 *
 *
 *
 *
 *
 *
 *
 *
 * 56.Explain Throw throws throwable ?
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 57.What are the new change in java memory model in java 8?
 * 58.Questions related to static synchronization in java?
 * 59.How to create Thread Pool and how to use it in database Connection pool
 * 60.What is the life cycle of thread and in Thread Pool?
 * 61.Explain Diamond problem in java how to solve that /
 * 62.How to create Create custom class loader in java?
 * 63.Java 8 Interface changes ?
 * 64.How to create an Object in java? Explain Different ways to do it ?
 * 65.How to restrict object creation in java ?
 *
 * 66.Scenario, you must create a cache thread pool using executor framework, but you don’t know the capacity or number of threads needed to achieve that task.
 * how will you determine how much threads you will need based on your requirement? is there any mechanism in executor’s framework to know the capacity of it.
 * (if you know the answers please comment below we can discuss a lot)?
 *
 * 67.In java 8 what all the major changes happened on memory side?
 * 68.what is the difference between completable future and callable and runnable future?
 * 69.Program — WAP using stream java 8,
 *
 * ArrayList ar = Arrays.asList{1,2,3,4,5,6,7,8,9,10}
 *
 * from the above list you have to find average of even numbers square using java 8
 *
 * 70. what is parallel processing in java 8, what are the uses of it.
 *
 * ################################Some Microservice related questions#############################################################################
 *
 *71. What is SAGA and CQRS microservice design pattern?
 *72.how to maintain a session between two microservices?
 *73. Write and end point in spring boot for get and save employee with syntax
 *74. how to communicate between two microservices (FYI there are three ways to do it make sure you know all three)
 *75. Where to save your username password in spring boot based microservices application
 *76. How Oauth/JWT works internally, how to make sure your token is not tampered?
 *77. what is IDP and SDP?
 *78. How to handle exceptions in Spring boot application what are the best practices to do it?
 *79. Design rest api for tiny url application, how many end point it requires and based on that there is discussion on it. so, it’s a system design question.
 *80. How to restrict the microservices calling the other microservices
 *
 * let’s say there are A,B,C,D,E services and i want to restrict A to call to C,D,E. how will you do that?
 *
 * 81. What is singleton design pattern?
 *
 * That seemed easy right, now you should know how it work
 *
 * a. How singleton works in term of Spring IOC containers, how it will behave?
 *
 * b. And how singleton works in Core java or in a class how singleton will work, is it object per class or one object in whole jvm.
 *
 * the answer is JVM creates and maintain object in terms of singleton pattern not the per class.
 *
 * 82. What are stateless bean in spring? name it and explain it?
 *
 * 83. What does Spring boot auto detect feature?
 *
 * #############################Now I have practical question that you should know in, order to know that you have really worked in java development&&&&&&&&&&&&&&&&&&&&&&&&&&&
 *
 * 84. how to parse json to hashmap?
 *
 * Ans = Use json library and use object mappers read values method to do that.
 *
 * 85. WAP to find duplicates in an array list?
 *
 * 86. Print Array list in descending order?
 *
 * 87. You should know how implement cache in java for eg. read about LRU cache implementation and which data structure is good for cache
 *
 * 88. One question Regarding JDBC which is quite old one but good to know
 *
 * what does JDBC forName() method does for you when you connect to any DB?
 *
 * 89. How parse XML file with json in java?
 *
 * 90. Can we insert Null in Concurrent Hashmap?
 *
 * 91. How to create custom hashmap of size 2GB?
 *
 * 92. Can we insert null key in hashamp and hashtable?
 *
 *
 *
 * 93.What is Spring bean lifecycle?
 *
 *
 *
 *
 * 94. So follow-up question would be type bean scopes and what are prototype and request bean scopes?
 *
 * 95. How would you call a methods before starting/loading an Spring boot applications ?
 *
 * 96. What is the Difference between @Component and @Service @respository @Controller annotations.
 *
 * 97. What exactly @SpringbootApplication annotation does?
 *
 * 98. How to build a restful webservice which is can fetch 1gb of data from database and send back without using Pagination, so question
 * is if you have big size response how would you send back from a rest webservice?
 *
 * 98. How would you design a binary tree kind of data structure into database design, basically the interviewer wants to know how you would design a
 * database in hierarchical way
 * 99. How would you store millions of records in a table? How many tables it requires, any database pattern can you use here?
 *
 * 100. Tell me about Pros and cons of microservice architecture why we need that (justify what problem microservice architecture solves)
 *
 * 101. Tell me about Microservice patterns? (Recently people started asking about this, it must know some of them with examples)
 * 102. follow-up question, which design pattern you have used and why?
 *
 * I have been asked regarding read heavy and write heavy application, what pattern you can go for. I told them CQRS which is command query.
 *
 * for database mostly SAGA pattern is used.
 *
 * 103. what is circuit breaker pattern have you used it?
 * 104. How to call methods Asynchronously, in spring framework how can we do that?
 *
 * FYI, you can use @Async annotation with executors to achieve that.
 *
 * 105. How to call other microservice asynchronously?
 *
 * 106. How to handle exception in spring framework? (using @ControlAdvice annotation)
 *
 * 107. How to break singleton design pattern? and what can we do to stop that?
 *
 * 108. In a database there is index, what is the datatype of index.
 *
 *
 *
 *
 109.Based on which methodologies unit tests can be written?
 110.How does Garbage Collection prevent a Java application from going out of memory?
 111.How is Java SE related to Java EE?
 112.Is ForkJoinPool introduced in Java 7 always a better alternative to ThreadPoolExecutor?
 113.What is the difference between HashMap, ConcurrentHashMap, and Map returned by Collections.synchronizedMap
 114.Servlets 3.0 introduced async support. Describe a use case for it.
 115.Why do you think lambda expressions are considered such a big thing for Java 8?
 116.Why would it be pointless for a static or final method to use dynamic binding?
 117.What will happen if you put System.exit(0) on try or catch block? Will finally block execute?






 118 what is maven life cycle?


Maven provides a set of predefined build phases and a default life cycle to manage a project's build process. The Maven life cycle defines the sequence of phases that are executed when building a project. Each phase is responsible for a specific task or set of tasks related to the build process.

The Maven default life cycle consists of three main life cycles:

Clean Life Cycle:
The clean life cycle is responsible for cleaning the project by removing any generated files and artifacts from previous builds. It is typically the first step in the build process and ensures a clean state before starting the build. The main phases of the clean life cycle are:
clean: Removes all the build output files and directories.
Default Life Cycle:
The default life cycle is the main life cycle for building a project. It includes the following main phases:
validate: Validates the project configuration.
compile: Compiles the source code of the project.
test: Runs unit tests against the compiled source code.
package: Packages the compiled code into a distributable format (e.g., JAR, WAR).
install: Installs the package in the local Maven repository.
deploy: Copies the package to a remote Maven repository for sharing with other developers.
Site Life Cycle:
The site life cycle is responsible for generating the project's documentation and reports. It includes the following main phases:
pre-site: Executes any tasks needed before generating the site.
site: Generates the project's site documentation.
post-site: Executes any tasks needed after generating the site.
site-deploy: Deploys the generated site to a remote location for sharing with others.
Each phase in a life cycle can have zero or more goals attached to it. Goals represent specific tasks to be executed within a phase. For example, within the compile phase, the compiler:compile goal is executed to compile the source code.

When you run a Maven build command (e.g., mvn clean package), Maven executes the life cycle up to the specified phase and all the previous phases. For instance, running mvn package will execute clean, validate, compile, test, and finally package phases in that order.

Developers can customize the default life cycle and define their own life cycles by configuring the pom.xml file of their projects. Maven's life cycle and plugin architecture make it easy to manage complex build processes in Java projects and other software projects.










119.What is rest apis or restful web services?


REST (Representational State Transfer) is an architectural style that defines a set of constraints and principles for designing and interacting with
networked resources. RESTful Web Services, often simply referred to as REST APIs, are a way of implementing and providing web services that adhere to
these principles.

Key principles of RESTful Web Services include:

Client-Server Architecture: Separation of concerns between client and server components, allowing them to evolve independently.
Statelessness: Each request from a client to the server must contain all the information needed to understand and process the request.
The server doesn't store any client state between requests.
Cacheability: Responses from the server can be cached by the client to improve performance. Cache control headers are used to manage caching behavior.
Uniform Interface: A consistent way to interact with resources through well-defined methods (HTTP verbs) and standard media types (e.g., JSON, XML).
Layered System: A system can be composed of multiple layers, where each layer has a specific responsibility, without affecting the interaction between clients
and servers.
Code on Demand (optional): Servers can extend client functionality by transferring executable code to the client, which the client then executes.
In the context of software development, RESTful Web Services are APIs that follow these principles. They use HTTP methods (GET, POST, PUT, DELETE, etc.)
to perform CRUD (Create, Read, Update, Delete) operations on resources. Resources are identified by URLs (Uniform Resource Locators),
and data is often exchanged using common data formats such as JSON or XML.

For example, in a RESTful API for managing users, you might have:

To retrieve a list of users: GET /users
To retrieve a specific user: GET /users/{id}
To create a new user: POST /users
To update a user: PUT /users/{id}
To delete a user: DELETE /users/{id}
RESTful Web Services are widely used for building scalable and interoperable web applications, as they promote loose coupling between client and server,
making it easier to evolve and maintain the system. They are commonly used in modern web development for building APIs that enable communication
between different applications and services.







 *
 *
 *
 *
 */