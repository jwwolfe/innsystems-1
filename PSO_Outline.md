# Brief outline of the PSO classes.

# PSO #

# Particles Class #

  * Previous position
  * Current position
    * (x,y,z) 3D Space
  * Velocity
    * (u,v,w) Vector
  * Fitness
    * Error, epochs
  * pBest
  * nBest
  * gBest
  * Previous error (?)
  * Neighborhood
    * number of particles

# Methods Class #

  * initialize()
    * initialize positions and velocities
  * fitness function
    * calculate fitness using epochs, error
  * adjust Velocity
    * based on difference of fitnesses
  * adjust Position
    * based on previous velocity
  * calculate best
    * calculate all the current bests
  * Max velocity thing
  * Assign neighbors
  * 

[PseudoPSO](PseudoPSO.md)