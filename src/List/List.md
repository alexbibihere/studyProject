Collection 是最基本的集合接口
list、set继承collection

list下  有ArrayList、LinkedList、Vector

ArrayList 底层是数组，具有查询快(查找有下标、所以快)，增删慢(因为数组删除一个元素，之后的元素都要前移，消耗资源大)

LinkedList 底层是双向链表，具有增删快，查询慢

Vector 是线程安全的，因为使用了Sychronized方法，性能上比ArrayList差些


Set


Map 没有继承Collection接口

HashTable 继承Map接口，HashTable是同步的

HashMap 是一个key-vaue形式的键值对，允许null



Vector   是同步的