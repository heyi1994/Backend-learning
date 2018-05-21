#### List集合  ;

  List是一个有序的集合，和set不同的是，List允许存储项的值为空 ;
  
  
  
##### 1、ArrayList ;
  
  ArrayList是一个数组实现的列表，由于数据是存入数组中的，所以它的特点也和数组一样，查询很快，但是中间部分的插入和删除很慢。
  
  
##### 2、Vector ;

  Vector就是ArrayList的线程安全版，它的方法前都加了synchronized锁，其他实现逻辑都相同。
  如果对线程安全要求不高的话，可以选择ArrayList，毕竟synchronized也很耗性能 ;
  
##### 3. LinkedList ;

  底层链表实现 ;
  
  
##### 4.总结 ;
   1.是按顺序查找
   2.允许存储项为空
   3.允许多个存储项的值相等
   可以知其然知其所以然
   
   然后对比LinkedList和ArrayList的实现方式不同，可以在不同的场景下使用不同的List
   ArrayList是由数组实现的，方便查找，返回数组下标对应的值即可，适用于多查找的场景
   LinkedList由链表实现，插入和删除方便，适用于多次数据替换的场景
  
  