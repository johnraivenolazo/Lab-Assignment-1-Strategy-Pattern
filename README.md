# Lab-Assignment-1-Strategy-Pattern

![UML Diagram](UMLDiagram.png)

## Overview

This simple Java project demonstrates the Strategy design pattern. Characters (Knight, Wizard, Archer)
use interchangeable attack and defense strategies to perform actions at runtime.

## Problem scenario

Suppose we have three types of characters in a `GameApp`:

- **Knight**: Attacks with a sword; uses three defense strategies (shield, dodge, magic barrier).
- **Wizard**: Casts spells; uses a magic barrier to defend.
- **Archer**: Shoots arrows; uses dodge to defend.

There are two strategy interfaces:

- `AttackStrategy`
     - `CastSpell`
     - `ShootArrow`
     - `SwingSword`

- `DefenseStrategy`
     - `Shield`
     - `Dodge`
     - `CreateMagic`