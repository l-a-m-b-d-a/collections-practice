# collections-practice
Collection Java 

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
           
           
<p color="red">
  AbstractQueue - still inherits AbstractCollection
  AbstractSet - still inherits AbstractCollection
<p>
<p color="green">Interface<p>
  Iterable, Collection, List, Queue, Deque, Set, SortedSet, NavigableSet, Map, SortedMap, NavigableMap
  
<p color="gray">Abstract class<p>
  AbstractList, AbstractQueue, AbstractSequentialList, AbstractCollection, AbstractSet, AbstractMap
  
<p color="red">class<p>
  ArrayList, Vector, Stack, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet, HashMap, LinkedHashMap, TreeMap, WeekHashMap

