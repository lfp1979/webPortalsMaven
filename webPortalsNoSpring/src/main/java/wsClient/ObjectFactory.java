
package wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import ok3w.entity.Admin;
import ok3w.entity.Article;
import ok3w.entity.Clazz;
import ok3w.entity.UrlLink;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetClassArticlesOrderByHitsResponse_QNAME = new QName("http://service.ok3w/", "getClassArticlesOrderByHitsResponse");
    private final static QName _GetUrlLinksResponse_QNAME = new QName("http://service.ok3w/", "getUrlLinksResponse");
    private final static QName _GetClassWithChild_QNAME = new QName("http://service.ok3w/", "getClassWithChild");
    private final static QName _DelClassResponse_QNAME = new QName("http://service.ok3w/", "delClassResponse");
    private final static QName _GetClassArticles1P_QNAME = new QName("http://service.ok3w/", "getClassArticles1p");
    private final static QName _GetPicListResponse_QNAME = new QName("http://service.ok3w/", "getPicListResponse");
    private final static QName _GetClassArticlesOrderAddTimeResponse_QNAME = new QName("http://service.ok3w/", "getClassArticlesOrderAddTimeResponse");
    private final static QName _ArticleSaveOrUpdate_QNAME = new QName("http://service.ok3w/", "articleSaveOrUpdate");
    private final static QName _ListArticlesByPageResponse_QNAME = new QName("http://service.ok3w/", "listArticlesByPageResponse");
    private final static QName _QueryArticlesByAttrResponse_QNAME = new QName("http://service.ok3w/", "QueryArticlesByAttrResponse");
    private final static QName _BuildListSortsResponse_QNAME = new QName("http://service.ok3w/", "buildListSortsResponse");
    private final static QName _GetClassPathResponse_QNAME = new QName("http://service.ok3w/", "getClassPathResponse");
    private final static QName _ClassSaveOrUpdateResponse_QNAME = new QName("http://service.ok3w/", "ClassSaveOrUpdateResponse");
    private final static QName _GetSortNamesResponse_QNAME = new QName("http://service.ok3w/", "getSortNamesResponse");
    private final static QName _ArticleSaveOrUpdateResponse_QNAME = new QName("http://service.ok3w/", "articleSaveOrUpdateResponse");
    private final static QName _ArticlePaginationResponse_QNAME = new QName("http://service.ok3w/", "articlePaginationResponse");
    private final static QName _GetArticleSimpleResponse_QNAME = new QName("http://service.ok3w/", "getArticleSimpleResponse");
    private final static QName _GetClass1PResponse_QNAME = new QName("http://service.ok3w/", "getClass1pResponse");
    private final static QName _DelClass_QNAME = new QName("http://service.ok3w/", "delClass");
    private final static QName _ListClassChildResponse_QNAME = new QName("http://service.ok3w/", "listClassChildResponse");
    private final static QName _ListSortsResponse_QNAME = new QName("http://service.ok3w/", "listSortsResponse");
    private final static QName _ClassSaveOrUpdate_QNAME = new QName("http://service.ok3w/", "ClassSaveOrUpdate");
    private final static QName _ArticlePagination_QNAME = new QName("http://service.ok3w/", "articlePagination");
    private final static QName _SetArticleProperryResponse_QNAME = new QName("http://service.ok3w/", "setArticleProperryResponse");
    private final static QName _Validate_QNAME = new QName("http://service.ok3w/", "validate");
    private final static QName _GetMoveArticleResponse_QNAME = new QName("http://service.ok3w/", "getMoveArticleResponse");
    private final static QName _ListArticlesByPage_QNAME = new QName("http://service.ok3w/", "listArticlesByPage");
    private final static QName _GetClass1P_QNAME = new QName("http://service.ok3w/", "getClass1p");
    private final static QName _GetPicList_QNAME = new QName("http://service.ok3w/", "getPicList");
    private final static QName _ListSorts_QNAME = new QName("http://service.ok3w/", "listSorts");
    private final static QName _GetClass2PResponse_QNAME = new QName("http://service.ok3w/", "getClass2pResponse");
    private final static QName _ListClassChild_QNAME = new QName("http://service.ok3w/", "listClassChild");
    private final static QName _GetClassArticlesOrderAddTime_QNAME = new QName("http://service.ok3w/", "getClassArticlesOrderAddTime");
    private final static QName _GetMoveArticle_QNAME = new QName("http://service.ok3w/", "getMoveArticle");
    private final static QName _AddArticleHitsResponse_QNAME = new QName("http://service.ok3w/", "addArticleHitsResponse");
    private final static QName _UpdateAdmin_QNAME = new QName("http://service.ok3w/", "updateAdmin");
    private final static QName _GetAdmin_QNAME = new QName("http://service.ok3w/", "getAdmin");
    private final static QName _SetArticleProperry_QNAME = new QName("http://service.ok3w/", "setArticleProperry");
    private final static QName _GetArticleFullResponse_QNAME = new QName("http://service.ok3w/", "getArticleFullResponse");
    private final static QName _GetClassPathInAdmin_QNAME = new QName("http://service.ok3w/", "getClassPathInAdmin");
    private final static QName _GetClass2P_QNAME = new QName("http://service.ok3w/", "getClass2p");
    private final static QName _GetClassPath_QNAME = new QName("http://service.ok3w/", "getClassPath");
    private final static QName _GetUrlLinks_QNAME = new QName("http://service.ok3w/", "getUrlLinks");
    private final static QName _GetClassArticlesOrderByHits_QNAME = new QName("http://service.ok3w/", "getClassArticlesOrderByHits");
    private final static QName _GetArticlePath_QNAME = new QName("http://service.ok3w/", "getArticlePath");
    private final static QName _GetSortNames_QNAME = new QName("http://service.ok3w/", "getSortNames");
    private final static QName _GetAdminResponse_QNAME = new QName("http://service.ok3w/", "getAdminResponse");
    private final static QName _GetClassWithChildResponse_QNAME = new QName("http://service.ok3w/", "getClassWithChildResponse");
    private final static QName _GetClassArticles1PResponse_QNAME = new QName("http://service.ok3w/", "getClassArticles1pResponse");
    private final static QName _GetClassArticles2PResponse_QNAME = new QName("http://service.ok3w/", "getClassArticles2pResponse");
    private final static QName _GetArticlePathResponse_QNAME = new QName("http://service.ok3w/", "getArticlePathResponse");
    private final static QName _ValidateResponse_QNAME = new QName("http://service.ok3w/", "validateResponse");
    private final static QName _GetArticleSimple_QNAME = new QName("http://service.ok3w/", "getArticleSimple");
    private final static QName _BuildListSorts_QNAME = new QName("http://service.ok3w/", "buildListSorts");
    private final static QName _GetClassArticles2P_QNAME = new QName("http://service.ok3w/", "getClassArticles2p");
    private final static QName _GetArticleFull_QNAME = new QName("http://service.ok3w/", "getArticleFull");
    private final static QName _UpdateAdminResponse_QNAME = new QName("http://service.ok3w/", "updateAdminResponse");
    private final static QName _GetClassPathInAdminResponse_QNAME = new QName("http://service.ok3w/", "getClassPathInAdminResponse");
    private final static QName _QueryArticlesByAttr_QNAME = new QName("http://service.ok3w/", "QueryArticlesByAttr");
    private final static QName _AddArticleHits_QNAME = new QName("http://service.ok3w/", "addArticleHits");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetClass2PResponse }
     * 
     */
    public GetClass2PResponse createGetClass2PResponse() {
        return new GetClass2PResponse();
    }

    /**
     * Create an instance of {@link ListSorts }
     * 
     */
    public ListSorts createListSorts() {
        return new ListSorts();
    }

    /**
     * Create an instance of {@link GetPicList }
     * 
     */
    public GetPicList createGetPicList() {
        return new GetPicList();
    }

    /**
     * Create an instance of {@link GetClass1P }
     * 
     */
    public GetClass1P createGetClass1P() {
        return new GetClass1P();
    }

    /**
     * Create an instance of {@link ListArticlesByPage }
     * 
     */
    public ListArticlesByPage createListArticlesByPage() {
        return new ListArticlesByPage();
    }

    /**
     * Create an instance of {@link GetMoveArticleResponse }
     * 
     */
    public GetMoveArticleResponse createGetMoveArticleResponse() {
        return new GetMoveArticleResponse();
    }

    /**
     * Create an instance of {@link Validate }
     * 
     */
    public Validate createValidate() {
        return new Validate();
    }

    /**
     * Create an instance of {@link ArticlePagination }
     * 
     */
    public ArticlePagination createArticlePagination() {
        return new ArticlePagination();
    }

    /**
     * Create an instance of {@link SetArticleProperryResponse }
     * 
     */
    public SetArticleProperryResponse createSetArticleProperryResponse() {
        return new SetArticleProperryResponse();
    }

    /**
     * Create an instance of {@link ClassSaveOrUpdate }
     * 
     */
    public ClassSaveOrUpdate createClassSaveOrUpdate() {
        return new ClassSaveOrUpdate();
    }

    /**
     * Create an instance of {@link GetClass1PResponse }
     * 
     */
    public GetClass1PResponse createGetClass1PResponse() {
        return new GetClass1PResponse();
    }

    /**
     * Create an instance of {@link ListSortsResponse }
     * 
     */
    public ListSortsResponse createListSortsResponse() {
        return new ListSortsResponse();
    }

    /**
     * Create an instance of {@link ListClassChildResponse }
     * 
     */
    public ListClassChildResponse createListClassChildResponse() {
        return new ListClassChildResponse();
    }

    /**
     * Create an instance of {@link DelClass }
     * 
     */
    public DelClass createDelClass() {
        return new DelClass();
    }

    /**
     * Create an instance of {@link GetArticleSimpleResponse }
     * 
     */
    public GetArticleSimpleResponse createGetArticleSimpleResponse() {
        return new GetArticleSimpleResponse();
    }

    /**
     * Create an instance of {@link ArticlePaginationResponse }
     * 
     */
    public ArticlePaginationResponse createArticlePaginationResponse() {
        return new ArticlePaginationResponse();
    }

    /**
     * Create an instance of {@link ArticleSaveOrUpdateResponse }
     * 
     */
    public ArticleSaveOrUpdateResponse createArticleSaveOrUpdateResponse() {
        return new ArticleSaveOrUpdateResponse();
    }

    /**
     * Create an instance of {@link ClassSaveOrUpdateResponse }
     * 
     */
    public ClassSaveOrUpdateResponse createClassSaveOrUpdateResponse() {
        return new ClassSaveOrUpdateResponse();
    }

    /**
     * Create an instance of {@link GetSortNamesResponse }
     * 
     */
    public GetSortNamesResponse createGetSortNamesResponse() {
        return new GetSortNamesResponse();
    }

    /**
     * Create an instance of {@link BuildListSortsResponse }
     * 
     */
    public BuildListSortsResponse createBuildListSortsResponse() {
        return new BuildListSortsResponse();
    }

    /**
     * Create an instance of {@link GetClassPathResponse }
     * 
     */
    public GetClassPathResponse createGetClassPathResponse() {
        return new GetClassPathResponse();
    }

    /**
     * Create an instance of {@link QueryArticlesByAttrResponse }
     * 
     */
    public QueryArticlesByAttrResponse createQueryArticlesByAttrResponse() {
        return new QueryArticlesByAttrResponse();
    }

    /**
     * Create an instance of {@link ListArticlesByPageResponse }
     * 
     */
    public ListArticlesByPageResponse createListArticlesByPageResponse() {
        return new ListArticlesByPageResponse();
    }

    /**
     * Create an instance of {@link ArticleSaveOrUpdate }
     * 
     */
    public ArticleSaveOrUpdate createArticleSaveOrUpdate() {
        return new ArticleSaveOrUpdate();
    }

    /**
     * Create an instance of {@link GetClassArticlesOrderAddTimeResponse }
     * 
     */
    public GetClassArticlesOrderAddTimeResponse createGetClassArticlesOrderAddTimeResponse() {
        return new GetClassArticlesOrderAddTimeResponse();
    }

    /**
     * Create an instance of {@link GetClassArticles1P }
     * 
     */
    public GetClassArticles1P createGetClassArticles1P() {
        return new GetClassArticles1P();
    }

    /**
     * Create an instance of {@link GetPicListResponse }
     * 
     */
    public GetPicListResponse createGetPicListResponse() {
        return new GetPicListResponse();
    }

    /**
     * Create an instance of {@link DelClassResponse }
     * 
     */
    public DelClassResponse createDelClassResponse() {
        return new DelClassResponse();
    }

    /**
     * Create an instance of {@link GetClassWithChild }
     * 
     */
    public GetClassWithChild createGetClassWithChild() {
        return new GetClassWithChild();
    }

    /**
     * Create an instance of {@link GetClassArticlesOrderByHitsResponse }
     * 
     */
    public GetClassArticlesOrderByHitsResponse createGetClassArticlesOrderByHitsResponse() {
        return new GetClassArticlesOrderByHitsResponse();
    }

    /**
     * Create an instance of {@link GetUrlLinksResponse }
     * 
     */
    public GetUrlLinksResponse createGetUrlLinksResponse() {
        return new GetUrlLinksResponse();
    }

    /**
     * Create an instance of {@link AddArticleHits }
     * 
     */
    public AddArticleHits createAddArticleHits() {
        return new AddArticleHits();
    }

    /**
     * Create an instance of {@link QueryArticlesByAttr }
     * 
     */
    public QueryArticlesByAttr createQueryArticlesByAttr() {
        return new QueryArticlesByAttr();
    }

    /**
     * Create an instance of {@link UpdateAdminResponse }
     * 
     */
    public UpdateAdminResponse createUpdateAdminResponse() {
        return new UpdateAdminResponse();
    }

    /**
     * Create an instance of {@link GetClassPathInAdminResponse }
     * 
     */
    public GetClassPathInAdminResponse createGetClassPathInAdminResponse() {
        return new GetClassPathInAdminResponse();
    }

    /**
     * Create an instance of {@link BuildListSorts }
     * 
     */
    public BuildListSorts createBuildListSorts() {
        return new BuildListSorts();
    }

    /**
     * Create an instance of {@link GetClassArticles2P }
     * 
     */
    public GetClassArticles2P createGetClassArticles2P() {
        return new GetClassArticles2P();
    }

    /**
     * Create an instance of {@link GetArticleFull }
     * 
     */
    public GetArticleFull createGetArticleFull() {
        return new GetArticleFull();
    }

    /**
     * Create an instance of {@link ValidateResponse }
     * 
     */
    public ValidateResponse createValidateResponse() {
        return new ValidateResponse();
    }

    /**
     * Create an instance of {@link GetArticleSimple }
     * 
     */
    public GetArticleSimple createGetArticleSimple() {
        return new GetArticleSimple();
    }

    /**
     * Create an instance of {@link GetClassArticles2PResponse }
     * 
     */
    public GetClassArticles2PResponse createGetClassArticles2PResponse() {
        return new GetClassArticles2PResponse();
    }

    /**
     * Create an instance of {@link GetArticlePathResponse }
     * 
     */
    public GetArticlePathResponse createGetArticlePathResponse() {
        return new GetArticlePathResponse();
    }

    /**
     * Create an instance of {@link GetClassArticles1PResponse }
     * 
     */
    public GetClassArticles1PResponse createGetClassArticles1PResponse() {
        return new GetClassArticles1PResponse();
    }

    /**
     * Create an instance of {@link GetClassWithChildResponse }
     * 
     */
    public GetClassWithChildResponse createGetClassWithChildResponse() {
        return new GetClassWithChildResponse();
    }

    /**
     * Create an instance of {@link GetAdminResponse }
     * 
     */
    public GetAdminResponse createGetAdminResponse() {
        return new GetAdminResponse();
    }

    /**
     * Create an instance of {@link GetSortNames }
     * 
     */
    public GetSortNames createGetSortNames() {
        return new GetSortNames();
    }

    /**
     * Create an instance of {@link GetArticlePath }
     * 
     */
    public GetArticlePath createGetArticlePath() {
        return new GetArticlePath();
    }

    /**
     * Create an instance of {@link GetClassArticlesOrderByHits }
     * 
     */
    public GetClassArticlesOrderByHits createGetClassArticlesOrderByHits() {
        return new GetClassArticlesOrderByHits();
    }

    /**
     * Create an instance of {@link GetUrlLinks }
     * 
     */
    public GetUrlLinks createGetUrlLinks() {
        return new GetUrlLinks();
    }

    /**
     * Create an instance of {@link GetClass2P }
     * 
     */
    public GetClass2P createGetClass2P() {
        return new GetClass2P();
    }

    /**
     * Create an instance of {@link GetClassPathInAdmin }
     * 
     */
    public GetClassPathInAdmin createGetClassPathInAdmin() {
        return new GetClassPathInAdmin();
    }

    /**
     * Create an instance of {@link GetClassPath }
     * 
     */
    public GetClassPath createGetClassPath() {
        return new GetClassPath();
    }

    /**
     * Create an instance of {@link GetArticleFullResponse }
     * 
     */
    public GetArticleFullResponse createGetArticleFullResponse() {
        return new GetArticleFullResponse();
    }

    /**
     * Create an instance of {@link GetAdmin }
     * 
     */
    public GetAdmin createGetAdmin() {
        return new GetAdmin();
    }

    /**
     * Create an instance of {@link SetArticleProperry }
     * 
     */
    public SetArticleProperry createSetArticleProperry() {
        return new SetArticleProperry();
    }

    /**
     * Create an instance of {@link AddArticleHitsResponse }
     * 
     */
    public AddArticleHitsResponse createAddArticleHitsResponse() {
        return new AddArticleHitsResponse();
    }

    /**
     * Create an instance of {@link GetMoveArticle }
     * 
     */
    public GetMoveArticle createGetMoveArticle() {
        return new GetMoveArticle();
    }

    /**
     * Create an instance of {@link UpdateAdmin }
     * 
     */
    public UpdateAdmin createUpdateAdmin() {
        return new UpdateAdmin();
    }

    /**
     * Create an instance of {@link GetClassArticlesOrderAddTime }
     * 
     */
    public GetClassArticlesOrderAddTime createGetClassArticlesOrderAddTime() {
        return new GetClassArticlesOrderAddTime();
    }

    /**
     * Create an instance of {@link ListClassChild }
     * 
     */
    public ListClassChild createListClassChild() {
        return new ListClassChild();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link MapElementsArray }
     * 
     */
    public MapElementsArray createMapElementsArray() {
        return new MapElementsArray();
    }

    /**
     * Create an instance of {@link MapElements }
     * 
     */
    public MapElements createMapElements() {
        return new MapElements();
    }

    /**
     * Create an instance of {@link Clazz }
     * 
     */
    public Clazz createClazz() {
        return new Clazz();
    }

    /**
     * Create an instance of {@link UrlLink }
     * 
     */
    public UrlLink createUrlLink() {
        return new UrlLink();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link Admin }
     * 
     */
    public Admin createAdmin() {
        return new Admin();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassArticlesOrderByHitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassArticlesOrderByHitsResponse")
    public JAXBElement<GetClassArticlesOrderByHitsResponse> createGetClassArticlesOrderByHitsResponse(GetClassArticlesOrderByHitsResponse value) {
        return new JAXBElement<GetClassArticlesOrderByHitsResponse>(_GetClassArticlesOrderByHitsResponse_QNAME, GetClassArticlesOrderByHitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUrlLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getUrlLinksResponse")
    public JAXBElement<GetUrlLinksResponse> createGetUrlLinksResponse(GetUrlLinksResponse value) {
        return new JAXBElement<GetUrlLinksResponse>(_GetUrlLinksResponse_QNAME, GetUrlLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassWithChild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassWithChild")
    public JAXBElement<GetClassWithChild> createGetClassWithChild(GetClassWithChild value) {
        return new JAXBElement<GetClassWithChild>(_GetClassWithChild_QNAME, GetClassWithChild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "delClassResponse")
    public JAXBElement<DelClassResponse> createDelClassResponse(DelClassResponse value) {
        return new JAXBElement<DelClassResponse>(_DelClassResponse_QNAME, DelClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassArticles1P }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassArticles1p")
    public JAXBElement<GetClassArticles1P> createGetClassArticles1P(GetClassArticles1P value) {
        return new JAXBElement<GetClassArticles1P>(_GetClassArticles1P_QNAME, GetClassArticles1P.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPicListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getPicListResponse")
    public JAXBElement<GetPicListResponse> createGetPicListResponse(GetPicListResponse value) {
        return new JAXBElement<GetPicListResponse>(_GetPicListResponse_QNAME, GetPicListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassArticlesOrderAddTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassArticlesOrderAddTimeResponse")
    public JAXBElement<GetClassArticlesOrderAddTimeResponse> createGetClassArticlesOrderAddTimeResponse(GetClassArticlesOrderAddTimeResponse value) {
        return new JAXBElement<GetClassArticlesOrderAddTimeResponse>(_GetClassArticlesOrderAddTimeResponse_QNAME, GetClassArticlesOrderAddTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticleSaveOrUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "articleSaveOrUpdate")
    public JAXBElement<ArticleSaveOrUpdate> createArticleSaveOrUpdate(ArticleSaveOrUpdate value) {
        return new JAXBElement<ArticleSaveOrUpdate>(_ArticleSaveOrUpdate_QNAME, ArticleSaveOrUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListArticlesByPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "listArticlesByPageResponse")
    public JAXBElement<ListArticlesByPageResponse> createListArticlesByPageResponse(ListArticlesByPageResponse value) {
        return new JAXBElement<ListArticlesByPageResponse>(_ListArticlesByPageResponse_QNAME, ListArticlesByPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryArticlesByAttrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "QueryArticlesByAttrResponse")
    public JAXBElement<QueryArticlesByAttrResponse> createQueryArticlesByAttrResponse(QueryArticlesByAttrResponse value) {
        return new JAXBElement<QueryArticlesByAttrResponse>(_QueryArticlesByAttrResponse_QNAME, QueryArticlesByAttrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildListSortsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "buildListSortsResponse")
    public JAXBElement<BuildListSortsResponse> createBuildListSortsResponse(BuildListSortsResponse value) {
        return new JAXBElement<BuildListSortsResponse>(_BuildListSortsResponse_QNAME, BuildListSortsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassPathResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassPathResponse")
    public JAXBElement<GetClassPathResponse> createGetClassPathResponse(GetClassPathResponse value) {
        return new JAXBElement<GetClassPathResponse>(_GetClassPathResponse_QNAME, GetClassPathResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassSaveOrUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "ClassSaveOrUpdateResponse")
    public JAXBElement<ClassSaveOrUpdateResponse> createClassSaveOrUpdateResponse(ClassSaveOrUpdateResponse value) {
        return new JAXBElement<ClassSaveOrUpdateResponse>(_ClassSaveOrUpdateResponse_QNAME, ClassSaveOrUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSortNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getSortNamesResponse")
    public JAXBElement<GetSortNamesResponse> createGetSortNamesResponse(GetSortNamesResponse value) {
        return new JAXBElement<GetSortNamesResponse>(_GetSortNamesResponse_QNAME, GetSortNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticleSaveOrUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "articleSaveOrUpdateResponse")
    public JAXBElement<ArticleSaveOrUpdateResponse> createArticleSaveOrUpdateResponse(ArticleSaveOrUpdateResponse value) {
        return new JAXBElement<ArticleSaveOrUpdateResponse>(_ArticleSaveOrUpdateResponse_QNAME, ArticleSaveOrUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticlePaginationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "articlePaginationResponse")
    public JAXBElement<ArticlePaginationResponse> createArticlePaginationResponse(ArticlePaginationResponse value) {
        return new JAXBElement<ArticlePaginationResponse>(_ArticlePaginationResponse_QNAME, ArticlePaginationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticleSimpleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getArticleSimpleResponse")
    public JAXBElement<GetArticleSimpleResponse> createGetArticleSimpleResponse(GetArticleSimpleResponse value) {
        return new JAXBElement<GetArticleSimpleResponse>(_GetArticleSimpleResponse_QNAME, GetArticleSimpleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClass1PResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClass1pResponse")
    public JAXBElement<GetClass1PResponse> createGetClass1PResponse(GetClass1PResponse value) {
        return new JAXBElement<GetClass1PResponse>(_GetClass1PResponse_QNAME, GetClass1PResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "delClass")
    public JAXBElement<DelClass> createDelClass(DelClass value) {
        return new JAXBElement<DelClass>(_DelClass_QNAME, DelClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListClassChildResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "listClassChildResponse")
    public JAXBElement<ListClassChildResponse> createListClassChildResponse(ListClassChildResponse value) {
        return new JAXBElement<ListClassChildResponse>(_ListClassChildResponse_QNAME, ListClassChildResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSortsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "listSortsResponse")
    public JAXBElement<ListSortsResponse> createListSortsResponse(ListSortsResponse value) {
        return new JAXBElement<ListSortsResponse>(_ListSortsResponse_QNAME, ListSortsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassSaveOrUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "ClassSaveOrUpdate")
    public JAXBElement<ClassSaveOrUpdate> createClassSaveOrUpdate(ClassSaveOrUpdate value) {
        return new JAXBElement<ClassSaveOrUpdate>(_ClassSaveOrUpdate_QNAME, ClassSaveOrUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticlePagination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "articlePagination")
    public JAXBElement<ArticlePagination> createArticlePagination(ArticlePagination value) {
        return new JAXBElement<ArticlePagination>(_ArticlePagination_QNAME, ArticlePagination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetArticleProperryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "setArticleProperryResponse")
    public JAXBElement<SetArticleProperryResponse> createSetArticleProperryResponse(SetArticleProperryResponse value) {
        return new JAXBElement<SetArticleProperryResponse>(_SetArticleProperryResponse_QNAME, SetArticleProperryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Validate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "validate")
    public JAXBElement<Validate> createValidate(Validate value) {
        return new JAXBElement<Validate>(_Validate_QNAME, Validate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoveArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getMoveArticleResponse")
    public JAXBElement<GetMoveArticleResponse> createGetMoveArticleResponse(GetMoveArticleResponse value) {
        return new JAXBElement<GetMoveArticleResponse>(_GetMoveArticleResponse_QNAME, GetMoveArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListArticlesByPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "listArticlesByPage")
    public JAXBElement<ListArticlesByPage> createListArticlesByPage(ListArticlesByPage value) {
        return new JAXBElement<ListArticlesByPage>(_ListArticlesByPage_QNAME, ListArticlesByPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClass1P }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClass1p")
    public JAXBElement<GetClass1P> createGetClass1P(GetClass1P value) {
        return new JAXBElement<GetClass1P>(_GetClass1P_QNAME, GetClass1P.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPicList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getPicList")
    public JAXBElement<GetPicList> createGetPicList(GetPicList value) {
        return new JAXBElement<GetPicList>(_GetPicList_QNAME, GetPicList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSorts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "listSorts")
    public JAXBElement<ListSorts> createListSorts(ListSorts value) {
        return new JAXBElement<ListSorts>(_ListSorts_QNAME, ListSorts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClass2PResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClass2pResponse")
    public JAXBElement<GetClass2PResponse> createGetClass2PResponse(GetClass2PResponse value) {
        return new JAXBElement<GetClass2PResponse>(_GetClass2PResponse_QNAME, GetClass2PResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListClassChild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "listClassChild")
    public JAXBElement<ListClassChild> createListClassChild(ListClassChild value) {
        return new JAXBElement<ListClassChild>(_ListClassChild_QNAME, ListClassChild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassArticlesOrderAddTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassArticlesOrderAddTime")
    public JAXBElement<GetClassArticlesOrderAddTime> createGetClassArticlesOrderAddTime(GetClassArticlesOrderAddTime value) {
        return new JAXBElement<GetClassArticlesOrderAddTime>(_GetClassArticlesOrderAddTime_QNAME, GetClassArticlesOrderAddTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoveArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getMoveArticle")
    public JAXBElement<GetMoveArticle> createGetMoveArticle(GetMoveArticle value) {
        return new JAXBElement<GetMoveArticle>(_GetMoveArticle_QNAME, GetMoveArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArticleHitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "addArticleHitsResponse")
    public JAXBElement<AddArticleHitsResponse> createAddArticleHitsResponse(AddArticleHitsResponse value) {
        return new JAXBElement<AddArticleHitsResponse>(_AddArticleHitsResponse_QNAME, AddArticleHitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "updateAdmin")
    public JAXBElement<UpdateAdmin> createUpdateAdmin(UpdateAdmin value) {
        return new JAXBElement<UpdateAdmin>(_UpdateAdmin_QNAME, UpdateAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getAdmin")
    public JAXBElement<GetAdmin> createGetAdmin(GetAdmin value) {
        return new JAXBElement<GetAdmin>(_GetAdmin_QNAME, GetAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetArticleProperry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "setArticleProperry")
    public JAXBElement<SetArticleProperry> createSetArticleProperry(SetArticleProperry value) {
        return new JAXBElement<SetArticleProperry>(_SetArticleProperry_QNAME, SetArticleProperry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticleFullResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getArticleFullResponse")
    public JAXBElement<GetArticleFullResponse> createGetArticleFullResponse(GetArticleFullResponse value) {
        return new JAXBElement<GetArticleFullResponse>(_GetArticleFullResponse_QNAME, GetArticleFullResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassPathInAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassPathInAdmin")
    public JAXBElement<GetClassPathInAdmin> createGetClassPathInAdmin(GetClassPathInAdmin value) {
        return new JAXBElement<GetClassPathInAdmin>(_GetClassPathInAdmin_QNAME, GetClassPathInAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClass2P }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClass2p")
    public JAXBElement<GetClass2P> createGetClass2P(GetClass2P value) {
        return new JAXBElement<GetClass2P>(_GetClass2P_QNAME, GetClass2P.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassPath")
    public JAXBElement<GetClassPath> createGetClassPath(GetClassPath value) {
        return new JAXBElement<GetClassPath>(_GetClassPath_QNAME, GetClassPath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUrlLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getUrlLinks")
    public JAXBElement<GetUrlLinks> createGetUrlLinks(GetUrlLinks value) {
        return new JAXBElement<GetUrlLinks>(_GetUrlLinks_QNAME, GetUrlLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassArticlesOrderByHits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassArticlesOrderByHits")
    public JAXBElement<GetClassArticlesOrderByHits> createGetClassArticlesOrderByHits(GetClassArticlesOrderByHits value) {
        return new JAXBElement<GetClassArticlesOrderByHits>(_GetClassArticlesOrderByHits_QNAME, GetClassArticlesOrderByHits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticlePath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getArticlePath")
    public JAXBElement<GetArticlePath> createGetArticlePath(GetArticlePath value) {
        return new JAXBElement<GetArticlePath>(_GetArticlePath_QNAME, GetArticlePath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSortNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getSortNames")
    public JAXBElement<GetSortNames> createGetSortNames(GetSortNames value) {
        return new JAXBElement<GetSortNames>(_GetSortNames_QNAME, GetSortNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getAdminResponse")
    public JAXBElement<GetAdminResponse> createGetAdminResponse(GetAdminResponse value) {
        return new JAXBElement<GetAdminResponse>(_GetAdminResponse_QNAME, GetAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassWithChildResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassWithChildResponse")
    public JAXBElement<GetClassWithChildResponse> createGetClassWithChildResponse(GetClassWithChildResponse value) {
        return new JAXBElement<GetClassWithChildResponse>(_GetClassWithChildResponse_QNAME, GetClassWithChildResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassArticles1PResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassArticles1pResponse")
    public JAXBElement<GetClassArticles1PResponse> createGetClassArticles1PResponse(GetClassArticles1PResponse value) {
        return new JAXBElement<GetClassArticles1PResponse>(_GetClassArticles1PResponse_QNAME, GetClassArticles1PResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassArticles2PResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassArticles2pResponse")
    public JAXBElement<GetClassArticles2PResponse> createGetClassArticles2PResponse(GetClassArticles2PResponse value) {
        return new JAXBElement<GetClassArticles2PResponse>(_GetClassArticles2PResponse_QNAME, GetClassArticles2PResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticlePathResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getArticlePathResponse")
    public JAXBElement<GetArticlePathResponse> createGetArticlePathResponse(GetArticlePathResponse value) {
        return new JAXBElement<GetArticlePathResponse>(_GetArticlePathResponse_QNAME, GetArticlePathResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "validateResponse")
    public JAXBElement<ValidateResponse> createValidateResponse(ValidateResponse value) {
        return new JAXBElement<ValidateResponse>(_ValidateResponse_QNAME, ValidateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticleSimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getArticleSimple")
    public JAXBElement<GetArticleSimple> createGetArticleSimple(GetArticleSimple value) {
        return new JAXBElement<GetArticleSimple>(_GetArticleSimple_QNAME, GetArticleSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildListSorts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "buildListSorts")
    public JAXBElement<BuildListSorts> createBuildListSorts(BuildListSorts value) {
        return new JAXBElement<BuildListSorts>(_BuildListSorts_QNAME, BuildListSorts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassArticles2P }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassArticles2p")
    public JAXBElement<GetClassArticles2P> createGetClassArticles2P(GetClassArticles2P value) {
        return new JAXBElement<GetClassArticles2P>(_GetClassArticles2P_QNAME, GetClassArticles2P.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticleFull }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getArticleFull")
    public JAXBElement<GetArticleFull> createGetArticleFull(GetArticleFull value) {
        return new JAXBElement<GetArticleFull>(_GetArticleFull_QNAME, GetArticleFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "updateAdminResponse")
    public JAXBElement<UpdateAdminResponse> createUpdateAdminResponse(UpdateAdminResponse value) {
        return new JAXBElement<UpdateAdminResponse>(_UpdateAdminResponse_QNAME, UpdateAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassPathInAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "getClassPathInAdminResponse")
    public JAXBElement<GetClassPathInAdminResponse> createGetClassPathInAdminResponse(GetClassPathInAdminResponse value) {
        return new JAXBElement<GetClassPathInAdminResponse>(_GetClassPathInAdminResponse_QNAME, GetClassPathInAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryArticlesByAttr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "QueryArticlesByAttr")
    public JAXBElement<QueryArticlesByAttr> createQueryArticlesByAttr(QueryArticlesByAttr value) {
        return new JAXBElement<QueryArticlesByAttr>(_QueryArticlesByAttr_QNAME, QueryArticlesByAttr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArticleHits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ok3w/", name = "addArticleHits")
    public JAXBElement<AddArticleHits> createAddArticleHits(AddArticleHits value) {
        return new JAXBElement<AddArticleHits>(_AddArticleHits_QNAME, AddArticleHits.class, null, value);
    }

}
