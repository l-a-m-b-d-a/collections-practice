# collections-practice
Collection Java 

             <p color="green">Iterable<p>                                                Map
                                 |                                                     | 
                                 |                                          ------------------------
    AbstractCollection-------Collection                                     |                      | 
           |                      |                                    AbstractMap             SortedMap   
           |                      |                                         |                      | 
           |              --------------------------                     HashMap              NavigableMap
           |              |       |                |                        |                      | 
           |              |       |                |                  LinkedHashMap             TreeMap    
      AbstractList-------List    Queue            Set 
           |                       |               | 
           |                       |               |------------------
      -------------------      ----------      AbstractSet            |
      |           |      |     |        |               |          SortedSet
    ArrayList   Vector  *ASL---Deque  AbstractQueue     |             |
                   |      |             |            HashSet    NavigableSet
                 Stack  LindedList  PriorityQueue       |             | 
                                                   LinkedHashSet    TreeSet
           
 ASL - <p color="red">AbstractSequentialList<p>   
  AbstractQueue - still inherits AbstractCollection
  AbstractSet - still inherits AbstractCollection
