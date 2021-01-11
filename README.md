# 2048
A recreation of 2048, using Java, the LibGDX  framework and Object Oriented Programming. Each tile on the board is created as a Tile class, 
where it is assigned an actual number value (2, 4, 8, etc.) or 0 if it is an empty tile. The actual board is initialized as a 2-D array of Tiles, 
and when there are no possible combinations of tiles left then the game is over. When we press Up/Down/Left/Right arrow, then we move all the tiles in that direction, and if any 2 tiles have the same value then we add their values to together. Pressing "New Game" will clear the board and generate 2 random new tiles,
which can either have a value of 2 or 4. To add to all of this, there is a counter next to the "New Game" button, which keeps track of the players score.

![alt text](https://github.com/navjeetdoad/2048/blob/master/2048.png)
