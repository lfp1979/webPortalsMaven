# webPortalsMaven

1.这是WebPortals项目的ejb和webService实现，俗称“经典模式”，另一个叫“轻量级模式”。
2.数据库配置与WebPortals项目相同，同时在jboss服务器上配置数据源 名称“java:/mysql”
3.根路径下（及\webPortalsMaven路径下）执行mvn package进行编译打包
4.将生成的webPortalsMaven\webPortalsEar\target\webPortalsEar-1.0.ear部署至jboss服务器即可
5.修改webPortalsNoSpring模块下ok3w.util.Util.getService()相关代码即可实现ejb与webService两种实现方式的切换
