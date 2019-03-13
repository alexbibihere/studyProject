**Collection** 是最基本的集合接口
list、set继承collection

**List**

list特点： 有序、可重复

list下常用子类：ArrayList、LinkedList、Vector

ArrayList 底层是数组，线程不安全，查询快(查找有下标、所以快)，增删慢(因为数组删除一个元素，之后的元素都要前移，消耗资源大)

LinkedList 底层是双向链表，线程不安全，增删快，查询慢

Vector 是线程安全的，因为使用了Sychronized方法，性能上比ArrayList差些


**Set**

Set集合的特点是 元素不可重复

Set常用子类：HahsSet、TreeSet、LinkedHashSet

HahsSet：底层数据结构是哈希表(是一个元素为链表的数组)

TreeSet:底层数据结构是红黑树，保证元素的排序方式

LinkedHashSet:底层数据结构有哈希表和链表组成

**Map**

Map 没有继承Collection接口

HashTable 继承Map接口，HashTable是同步的

HashMap 是一个key-vaue形式的键值对，允许null
-  **HashMap是最常用的一个实现。HashMap使用hash映射来存取数据，这个速度是相当快，是O(1)的速度。其容量capacity，和负载因子load
   factor可以在一开始设定。当元素个数达到capacity*load factor的时候，就会进行扩容**
    
 TreeMap

ConcurrentHashMap

**Vector**   是同步的