''''A robot on an infinite XY-plane starts at point (0, 0) facing north. The robot receives an array of integers commands, which represents a sequence of moves that it needs to execute. There are only three possible types of instructions the robot can receive:

-2: Turn left 90 degrees.
-1: Turn right 90 degrees.
1 <= k <= 9: Move forward k units, one unit at a time.
Some of the grid squares are obstacles. The ith obstacle is at grid point obstacles[i] = (xi, yi). If the robot runs into an obstacle, it will stay in its current location (on the block adjacent to the obstacle) and move onto the next command.

Return the maximum squared Euclidean distance that the robot reaches at any point in its path (i.e. if the distance is 5, return 25).

Note:

There can be an obstacle at (0, 0). If this happens, the robot will ignore the obstacle until it has moved off the origin. However, it will be unable to return to (0, 0) due to the obstacle.
North means +Y direction.
East means +X direction.
South means -Y direction.
West means -X direction.



Senior
Array
Hash Table
Simulation
Weekly Contest 94


'''




class Solution:
    def robotSim(self, commands: List[int], obstacles: List[List[int]]) -> int:

        

        l=len(commands)

        finalanswer=0

        pos='N'

        posY=0

        posX=0

        posY=0

       

     
        obstacle_set = set()
        for obs in obstacles:
            obstacle_set.add((obs[0], obs[1]))
    
 
        for i in range(0,l):


            print(f"the value list is {commands[i]}")

            print(f"The posX is {posX} and posy is {posY}")
            print(f"The position is {pos}")



            if commands[i]==-1:

                print("position chainging ")

                if pos=='N':

                    pos='E'

                    print(f"the new pos is {pos}")

                elif pos=='E':

                    pos='S'

                elif pos=='S':

                    pos='W'
                

                else:
                    pos='N'


            elif commands[i]==-2:

                if pos=='N':

                    pos='W'

                elif pos=='E':

                    pos='N'

                elif pos=='S':

                    pos='E'
                

                else:
                    pos='S'



            else:


                for i in range(0,commands[i]):

                    if pos=='N':

                        if (posX,posY+1) in obstacle_set:
                            break

                        posY=posY+1
               
                    if pos=='S':

                        if (posX,posY-1) in obstacle_set:
                            break

                        posY=posY-1

                    if pos=='W':

                        if (posX-1,posY) in obstacle_set:
                            break

                        posX=posX-1

                    if pos=='E':

                        if (posX+1,posY) in obstacle_set:
                            break

                        posX=posX+1

                    answer=posX*posX+posY*posY

                    finalanswer=max(answer,finalanswer)



                    # if (posX,posY) in obstacle_set:

                    #     break

                

                


        

        print(f"The posX is {posX} and posy is {posY}")

        # answer=posX*posX+posY*posY


        return finalanswer
        