# 1.什么是ark-layer-framework？
&emsp;&emsp;什么是ark-layer-framework是ark系列框架中的分层框架，是一种应用架构，类似cola框架。
# 2.ark-layer-framework解决了什么问题？
&emsp;&emsp;相比较于传统的三层框架，分层框架=整洁架构+DDD架构。
<br/>
<img src="./img/1.png" width="500px"/>
<br/>
<img src="./img/2.png" width="500px"/>
# 3.ark-layer-framework的使用场景
- 分层框架，适用于业务比较复杂的项目使用，如中台项目
# 4.ark-layer-framework服务如何生成？
例子：创建my-demo项目，指定groupId、artifactId、version、package
<br/>
mvn archetype:generate -DarchetypeGroupId=com.ark.layer -DarchetypeArtifactId=ark-layer-framework-archetype -DarchetypeVersion=1.0 -DgroupId=com.ark.demo -DartifactId=my-demo -Dversion=1.0 -Dpackage=com.ark.demo 

