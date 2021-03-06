package wsClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2017-07-19T22:25:07.133+08:00
 * Generated source version: 2.4.6
 * 
 */
@WebService(targetNamespace = "http://service.ok3w/", name = "IServiceWsImp")
@XmlSeeAlso({ObjectFactory.class})
public interface IServiceWsImp {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getClassArticlesOrderAddTime", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassArticlesOrderAddTime")
    @WebMethod
    @ResponseWrapper(localName = "getClassArticlesOrderAddTimeResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassArticlesOrderAddTimeResponse")
    public java.util.List<ok3w.entity.Article> getClassArticlesOrderAddTime(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getArticleFull", targetNamespace = "http://service.ok3w/", className = "wsClient.GetArticleFull")
    @WebMethod
    @ResponseWrapper(localName = "getArticleFullResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetArticleFullResponse")
    public ok3w.entity.Article getArticleFull(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @RequestWrapper(localName = "ClassSaveOrUpdate", targetNamespace = "http://service.ok3w/", className = "wsClient.ClassSaveOrUpdate")
    @WebMethod(operationName = "ClassSaveOrUpdate")
    @ResponseWrapper(localName = "ClassSaveOrUpdateResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.ClassSaveOrUpdateResponse")
    public void classSaveOrUpdate(
        @WebParam(name = "arg0", targetNamespace = "")
        ok3w.entity.Clazz arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getClass2p", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClass2P")
    @WebMethod(operationName = "getClass2p")
    @ResponseWrapper(localName = "getClass2pResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClass2PResponse")
    public ok3w.entity.Clazz getClass2P(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "articlePagination", targetNamespace = "http://service.ok3w/", className = "wsClient.ArticlePagination")
    @WebMethod
    @ResponseWrapper(localName = "articlePaginationResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.ArticlePaginationResponse")
    public java.lang.String articlePagination(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "validate", targetNamespace = "http://service.ok3w/", className = "wsClient.Validate")
    @WebMethod
    @ResponseWrapper(localName = "validateResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.ValidateResponse")
    public boolean validate(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @RequestWrapper(localName = "articleSaveOrUpdate", targetNamespace = "http://service.ok3w/", className = "wsClient.ArticleSaveOrUpdate")
    @WebMethod
    @ResponseWrapper(localName = "articleSaveOrUpdateResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.ArticleSaveOrUpdateResponse")
    public void articleSaveOrUpdate(
        @WebParam(name = "arg0", targetNamespace = "")
        ok3w.entity.Article arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getPicList", targetNamespace = "http://service.ok3w/", className = "wsClient.GetPicList")
    @WebMethod
    @ResponseWrapper(localName = "getPicListResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetPicListResponse")
    public java.util.List<ok3w.entity.Article> getPicList();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getClassArticles1p", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassArticles1P")
    @WebMethod(operationName = "getClassArticles1p")
    @ResponseWrapper(localName = "getClassArticles1pResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassArticles1PResponse")
    public java.util.List<ok3w.entity.Article> getClassArticles1P(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "listClassChild", targetNamespace = "http://service.ok3w/", className = "wsClient.ListClassChild")
    @WebMethod
    @ResponseWrapper(localName = "listClassChildResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.ListClassChildResponse")
    public java.util.List<ok3w.entity.Clazz> listClassChild(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @RequestWrapper(localName = "addArticleHits", targetNamespace = "http://service.ok3w/", className = "wsClient.AddArticleHits")
    @WebMethod
    @ResponseWrapper(localName = "addArticleHitsResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.AddArticleHitsResponse")
    public void addArticleHits(
        @WebParam(name = "arg0", targetNamespace = "")
        ok3w.entity.Article arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getClassPath", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassPath")
    @WebMethod
    @ResponseWrapper(localName = "getClassPathResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassPathResponse")
    public wsClient.MapElementsArray getClassPath(
        @WebParam(name = "arg0", targetNamespace = "")
        ok3w.entity.Clazz arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getClass1p", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClass1P")
    @WebMethod(operationName = "getClass1p")
    @ResponseWrapper(localName = "getClass1pResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClass1PResponse")
    public ok3w.entity.Clazz getClass1P(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "listArticlesByPage", targetNamespace = "http://service.ok3w/", className = "wsClient.ListArticlesByPage")
    @WebMethod
    @ResponseWrapper(localName = "listArticlesByPageResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.ListArticlesByPageResponse")
    public java.util.List<ok3w.entity.Article> listArticlesByPage(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getClassWithChild", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassWithChild")
    @WebMethod
    @ResponseWrapper(localName = "getClassWithChildResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassWithChildResponse")
    public ok3w.entity.Clazz getClassWithChild(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getUrlLinks", targetNamespace = "http://service.ok3w/", className = "wsClient.GetUrlLinks")
    @WebMethod
    @ResponseWrapper(localName = "getUrlLinksResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetUrlLinksResponse")
    public java.util.List<ok3w.entity.UrlLink> getUrlLinks();

    @RequestWrapper(localName = "setArticleProperry", targetNamespace = "http://service.ok3w/", className = "wsClient.SetArticleProperry")
    @WebMethod
    @ResponseWrapper(localName = "setArticleProperryResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.SetArticleProperryResponse")
    public void setArticleProperry(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getClassArticles2p", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassArticles2P")
    @WebMethod(operationName = "getClassArticles2p")
    @ResponseWrapper(localName = "getClassArticles2pResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassArticles2PResponse")
    public java.util.List<ok3w.entity.Article> getClassArticles2P(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getArticlePath", targetNamespace = "http://service.ok3w/", className = "wsClient.GetArticlePath")
    @WebMethod
    @ResponseWrapper(localName = "getArticlePathResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetArticlePathResponse")
    public wsClient.MapElementsArray getArticlePath(
        @WebParam(name = "arg0", targetNamespace = "")
        ok3w.entity.Article arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "updateAdmin", targetNamespace = "http://service.ok3w/", className = "wsClient.UpdateAdmin")
    @WebMethod
    @ResponseWrapper(localName = "updateAdminResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.UpdateAdminResponse")
    public int updateAdmin(
        @WebParam(name = "arg0", targetNamespace = "")
        ok3w.entity.Admin arg0
    );

    @RequestWrapper(localName = "delClass", targetNamespace = "http://service.ok3w/", className = "wsClient.DelClass")
    @WebMethod
    @ResponseWrapper(localName = "delClassResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.DelClassResponse")
    public void delClass(
        @WebParam(name = "arg0", targetNamespace = "")
        ok3w.entity.Clazz arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "QueryArticlesByAttr", targetNamespace = "http://service.ok3w/", className = "wsClient.QueryArticlesByAttr")
    @WebMethod(operationName = "QueryArticlesByAttr")
    @ResponseWrapper(localName = "QueryArticlesByAttrResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.QueryArticlesByAttrResponse")
    public java.util.List<ok3w.entity.Article> queryArticlesByAttr(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Object arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getSortNames", targetNamespace = "http://service.ok3w/", className = "wsClient.GetSortNames")
    @WebMethod
    @ResponseWrapper(localName = "getSortNamesResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetSortNamesResponse")
    public wsClient.MapElementsArray getSortNames();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getClassArticlesOrderByHits", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassArticlesOrderByHits")
    @WebMethod
    @ResponseWrapper(localName = "getClassArticlesOrderByHitsResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassArticlesOrderByHitsResponse")
    public java.util.List<ok3w.entity.Article> getClassArticlesOrderByHits(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "buildListSorts", targetNamespace = "http://service.ok3w/", className = "wsClient.BuildListSorts")
    @WebMethod
    @ResponseWrapper(localName = "buildListSortsResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.BuildListSortsResponse")
    public java.util.List<ok3w.entity.Clazz> buildListSorts(
        @WebParam(name = "arg0", targetNamespace = "")
        java.util.List<ok3w.entity.Clazz> arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAdmin", targetNamespace = "http://service.ok3w/", className = "wsClient.GetAdmin")
    @WebMethod
    @ResponseWrapper(localName = "getAdminResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetAdminResponse")
    public ok3w.entity.Admin getAdmin(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getClassPathInAdmin", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassPathInAdmin")
    @WebMethod
    @ResponseWrapper(localName = "getClassPathInAdminResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetClassPathInAdminResponse")
    public wsClient.MapElementsArray getClassPathInAdmin(
        @WebParam(name = "arg0", targetNamespace = "")
        ok3w.entity.Clazz arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "listSorts", targetNamespace = "http://service.ok3w/", className = "wsClient.ListSorts")
    @WebMethod
    @ResponseWrapper(localName = "listSortsResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.ListSortsResponse")
    public java.util.List<ok3w.entity.Clazz> listSorts();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getArticleSimple", targetNamespace = "http://service.ok3w/", className = "wsClient.GetArticleSimple")
    @WebMethod
    @ResponseWrapper(localName = "getArticleSimpleResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetArticleSimpleResponse")
    public ok3w.entity.Article getArticleSimple(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getMoveArticle", targetNamespace = "http://service.ok3w/", className = "wsClient.GetMoveArticle")
    @WebMethod
    @ResponseWrapper(localName = "getMoveArticleResponse", targetNamespace = "http://service.ok3w/", className = "wsClient.GetMoveArticleResponse")
    public ok3w.entity.Article getMoveArticle();
}
