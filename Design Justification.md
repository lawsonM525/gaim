<h1> Design Justification </h1>

<h2>Class Architecture Diagram</h2>


<h2> World Map</h2>
<--- Image of World Map --->
We used a graph class to implement the map of the game world instead of a grid system, as we believe it would be easier for a user to hop from place to place when the places are small, finite and connected by edges.
Since users are limited by a timer, we simplified the game by only adding five locations on the map so they can all have tasks and the user can navigate through them before the timer ends.