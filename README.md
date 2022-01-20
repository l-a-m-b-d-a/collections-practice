# collections-practice
<h1 text-align="center" font-size="16px">Collection Java<h1> 

                              Iterable                                                Map
                                 |                                                     | 
                                 |                                          ------------------------
    AbstractCollection-------Collection                                     |                      | 
           |                      |                                    AbstractMap--------      SortedMap   
           |                      |                                         |            |         | 
           |              --------------------------                     HashMap         |     NavigableMap
           |              |       |                |                        |            |         | 
           |              |       |                |                  LinkedHashMap      |------TreeMap    
      AbstractList-------List    Queue            Set                                    |
           |                       |               |                                WeekHashMap
           |                       |               |------------------
      -------------------      ----------      AbstractSet            |
      |           |      |     |        |               |          SortedSet
    ArrayList   Vector  *ASL---Deque  AbstractQueue     |             |
                   |      |             |            HashSet    NavigableSet
                 Stack  LindedList  PriorityQueue       |             | 
                                                   LinkedHashSet    TreeSet
           
           
<p color="orange">
  AbstractQueue - still inherits AbstractCollection
<p>
<p color="orange">
   AbstractSet - still inherits AbstractCollection
<p>

<p color="green">Interface<p>
  Iterable, Collection, List, Queue, Deque, Set, SortedSet, NavigableSet, Map, SortedMap, NavigableMap
  
<p color="gray">Abstract class<p>
  AbstractList, AbstractQueue, AbstractSequentialList, AbstractCollection, AbstractSet, AbstractMap
  
<p color="red">Class<p>
  ArrayList, Vector, Stack, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet, HashMap, LinkedHashMap, TreeMap, WeekHashMap

