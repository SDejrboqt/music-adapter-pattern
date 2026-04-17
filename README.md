# Adapter Pattern for Music Band

## Description
This project demonstrates the Adapter Design Pattern by unifying different musical instrument interfaces into a single `play()` method.

## Problem
Different instruments have different methods: `startElectric()`, `playSound()`, `blow()`, `hit()`. The Adapter Pattern converts each of these to a common `play()` method.

## How to Run
1. Open terminal in the `src` folder.
2. Compile: `javac Main.java`
3. Run: `java Main`

## Expected Output
=== Music Band using Adapter Pattern ===

Guitar: power on.
Guitar: strumming sound 
---
Piano: power on.
Piano: beautiful melody 
---
Flute: blowing air 
Flute: clear tone 
---
Drum: hit the drum 
---