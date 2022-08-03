


1)Explain JVM architecture 
Ans 1) https://www.youtube.com/watch?v=bspS-uTK0IM
https://www.youtube.com/watch?v=DXykPdFt1KY&t=239s

 Can one class be loaded by two different ClassLoader in Java ?
 class is always identified using its fully qualified name (package.classname). So when a class is loaded into JVM, you have an entry as (package, classname, classloader). Therefore the same class can be loaded twice by two different ClassLoader instances.


<img width="610" alt="image" src="https://user-images.githubusercontent.com/12210811/163709924-205644cc-e0fb-4e2b-88a0-cbe31d8b5803.png">

<img width="671" alt="image" src="https://user-images.githubusercontent.com/12210811/163709931-8121f261-c419-4625-b2d4-78a58b2489c8.png">


<img width="690" alt="image" src="https://user-images.githubusercontent.com/12210811/163709867-1bb31737-a651-4cc6-8f40-db4261592b4a.png">



<img width="525" alt="image" src="https://user-images.githubusercontent.com/12210811/169122570-e3d3f554-853c-4833-8461-67b3e7a45bc9.png">

