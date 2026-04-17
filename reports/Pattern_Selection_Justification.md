# Pattern Selection & Justification

## Selected design pattern
**Adapter Pattern (Object Adapter)**

## Why it fits the identified problem
- The core problem is that existing instrument classes have incompatible method names (`startElectric()`, `blow()`, `hit()`) while the client expects a uniform `play()` method.
- The Adapter Pattern wraps each adaptee (instrument) and translates the `play()` call into the adaptee's specific method(s).
- New instruments can be added later by creating new adapter classes – no change to existing client code.

## Reasoning based on design principles
- **Single Responsibility Principle** – Each adapter is responsible for adapting exactly one type of instrument.
- **Open/Closed Principle** – The system is open for extension (new adapters) but closed for modification (client code remains unchanged).
- **Interface Segregation Principle** – The target interface `Playable` contains only one method `play()`, which is minimal and focused.
- **Dependency Inversion Principle** – The client (`Main` class) depends on the `Playable` abstraction, not on concrete instrument classes.

## Additional benefits
- Promotes code reuse – existing instrument classes are not modified.
- Easy to test – adapters can be mocked.
- Follows established object-oriented design best practices.