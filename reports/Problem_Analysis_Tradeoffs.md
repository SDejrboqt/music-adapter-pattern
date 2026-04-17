# Problem Analysis & Trade-offs Report

## Real-world software problem
In a music band management system, different musical instruments have different interfaces:
- Electric guitar requires `startElectric()` then `playSound()`.
- Electric piano requires `startElectric()` then `playSound()`.
- Flute requires `blow()`.
- Drum requires `hit()`.

A musician wants to play any instrument using a single unified method `play()` without knowing the internal details of each instrument.

## Main design challenges
1. **Interface incompatibility** – each instrument exposes different method names.
2. **Extensibility** – the system should allow adding new instrument types (e.g., saxophone, violin) without modifying existing client code.
3. **Decoupling** – the client (musician) should depend on an abstraction, not concrete instrument classes.

## Comparison of two design patterns

| Aspect | Adapter Pattern | Facade Pattern |
|--------|----------------|----------------|
| Intent | Convert one interface to another expected by client | Provide a simplified interface to a complex subsystem |
| Solves | Interface mismatch | Complexity and many dependencies |
| Application in our problem | Wrap each instrument individually to convert `startElectric()`/`blow()`/`hit()` to `play()` | Wrap the whole audio system, but cannot convert individual methods |
| Ease of adding new instruments | High – just write a new adapter | Low – would require changing the facade |
| Trade-off | Increases number of classes (adapters) | Simpler but does not solve interface mismatch |

## Conclusion – Selected pattern
**Adapter Pattern (Object Adapter variant)** is selected because it directly solves interface incompatibility, follows the Open/Closed Principle, and allows reuse of existing instrument classes without modification.