JSON:JavaScript Object Notation(JavaScript 对象表示法)

JSON是存储和交换文本信息的语法。类似XML.

# JSON比XML更小、更快、更易解析。 
- javaScript原生支持JSON
- XML解析成DOM对象的时候，浏览器IE和firefox会有差异
- 使用JSON会更简单

# JSON语法
 客户端与服务端的交互数据有两种
 - 数据
 - 对象
 
 JSON表示的数据要么就是对象，要么就是数组  
 JSON语法是javaScript语法的子集，javaScript用[]中括号来表示数组，用{}大括号来表示对象，JSON也是如此

# JSON数组
'''var employees = [ {"firstName":"Bill","lastName":"Gates"},  
{"firstName":"George","lastName":"Bush"},  
{"firstName":"Thomas","lastName":"Carter"} ]''' 

# JSON对象
'''var obj ={ str:"zhongfu",
method:function(){alert("hello");}}'''

# 将JavaBean转换成JSON

JSONArray jSONArray = JSONArray.fromObject(map);