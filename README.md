# LDTS_T05_G07 - Tomb of the Mask

In this amazing game you can become an explorer to find the hidden treasures of the lost tomb, by collecting all the coins through different mazes to reach the ultimate goal, the Aztec gold left deep inside the tomb. But beware of the traps!

This project was developed by *Diogo Lemos* (up202003484@fe.up.pt), *Jaime Fonseca* (up202108789@fe.up.pt), and *Rafael Cerqueira* (up201910200@fe.up.pt) for LDTS.

## IMPLEMENTED FEATURES


- **Travelling through the walls** - The game character will move through the walls in the four main directions until it hits a wall.
- **Getting coins** - When the game character touches the coins it collects them.
- **Spikes**- If the hero touches a spike he faints and it's game over.
- **Monsters**- monsters will move around the map to make collecting the coins harder knocking you out upon contact.
- **Dificulty Based Mazes**- Three diferent mazes with increased difficulty to enjoy.

## DESIGN

 The project design is based on the "MVC" (Model view controller) software design pattern.
This design is based, as the name implies, on three basic components, which are represented in our work by three different directories:

- **Modules(Model)** – contains all the classes with the constituent elements, as well as the Arena class, which is the class that has the remaining elements as attributes. This class will only be concerned with storing, manipulating, and managing them.

- **View(view)** – Contains the class that will be responsible for outputting data (Lanterna, in this case).

- **Controller(controller)** – Manipulates the data the user provides as input, then calls the model (arena).

 In terms of the design patterns that have been implemented, in the controller directory, there is a sub-directory called commands. This happens because the “command pattern” was implemented in changing the hero's position. An abstract “command” class was created that will have different implementations depending on the input provided (move the hero up, down, etc). 
 
 The advantage of using this “pattern” is the separation of the object that executes the operation and the one that calls the operation. Previously the hero himself had methods of changing his position, now, it will be through the different commands that this will be implemented.

 One of the problems we faced in this first phase of the work was a problem related to the performance of the program. It turns out that in the initial implementation, whenever we wanted the hero to change position, all the walls in the arena were checked to see if any of them matched our hero's new position. Initially, with a small arena, there was no problem, however, as soon as we implemented larger maps the game crashed when you had to walk too many positions at once (given the nature of our game where the hero always moves until he hits a wall). 
  
 So the solution found was, when creating the arena, to keep a record of all the free spaces the hero could hypothetically move into. So when the hero wants to change position, he needs to check that array if the position is there and, if found, it executes the change immediately, instead of always having to check all existing walls. 
 
## GIF

 ![gif](https://github.com/FEUP-LDTS-2022/project-l05gr07/blob/05571241f042db944f6ac7890b85d8f42d8485d0/img/Animation.gif)

## UMLs

### UML-Controller
 ![uml-controller](https://github.com/FEUP-LDTS-2022/project-l05gr07/blob/3a6523506af67d6c03eac411aa7221f48e6208d6/docs/UML/controllers.png)
 
### UML-Modules 
 ![uml-modules](https://github.com/FEUP-LDTS-2022/project-l05gr07/blob/3a6523506af67d6c03eac411aa7221f48e6208d6/docs/UML/modules.png)
 
### UML-States
 ![uml-states](https://github.com/FEUP-LDTS-2022/project-l05gr07/blob/3a6523506af67d6c03eac411aa7221f48e6208d6/docs/UML/states.png)
 
### UML-Viewers
 ![uml-viewers](https://github.com/FEUP-LDTS-2022/project-l05gr07/blob/3a6523506af67d6c03eac411aa7221f48e6208d6/docs/UML/viewers.png)
   
## TESTING

 ![tests](https://github.com/FEUP-LDTS-2022/project-l05gr07/blob/e9a1476e0ef0ca963129e58af9a5543b8feca0ce/img/tests_v2.png)

## SELF-EVALUATION

>
- Diogo Lemos: 33%
- Jaime Fonseca: 33%
- Rafael Cerqueira: 33%

