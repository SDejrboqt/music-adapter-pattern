# Adapter Pattern for Music Band

## Description
This project demonstrates the Adapter Design Pattern by unifying different musical instrument interfaces into a single `play()` method.

## Problem
Different instruments have different methods: `startElectric()`, `playSound()`, `blow()`, `hit()`. The Adapter Pattern converts each of these to a common `play()` method.

## How to Run
Open terminal in the `src` folder.
- Compile: `javac Main.java`
- Run: `java Main`

## Expected Output

## Project Deliverables (Required by Instructor)

| Deliverable | Location |
|-------------|----------|
| Problem Analysis & Trade-offs | [`reports/Problem_Analysis_Tradeoffs.md`](reports/Problem_Analysis_Tradeoffs.md) |
| Pattern Selection & Justification | [`reports/Pattern_Selection_Justification.md`](reports/Pattern_Selection_Justification.md) |
| UML Diagram | [`reports/UML_Diagram.png`](reports/UML_Diagram.png) |
| Contribution Log | [`CONTRIBUTION_LOG.md`](CONTRIBUTION_LOG.md) |
| GitHub Project Board Link | [`GITHUB_BOARD_LINK.txt`](GITHUB_BOARD_LINK.txt) |
| Presentation Slides | [`presentation/Adapter_Pattern_Presentation.pdf`](presentation/Adapter_Pattern_Presentation.pdf) |

## Source Code Structure
- `src/Main.java` – Entry point
- `src/Playable.java` – Target interface with `play()`
- `src/adaptees/` – Original instrument classes (Guitar, Piano, Flute, Drum)
- `src/adapters/` – Adapter classes implementing `Playable`

---
**Note:** Each team member contributed via GitHub. Commit history and project board are accessible through the links above.
