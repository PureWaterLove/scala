object LocationText extends App{
  //位置与场所的Trait
  /*
  //位置
  trait Location{

  }
  //场所
  trait Site extends Location{

  }

  //虚拟场所
  trait VirtualSite extends Site{

  }
  //物理场所
  trait PhysicalSite extends Site{

  }
  //街道地址
  trait Address extends PhysicalSite{

  }
  //邮政地址
  trait Postalcode extends PhysicalSite{

  }
  //数据库实例
  trait DatabaseInstanceSite extends VirtualSite{

  }
  //服务器地址
  trait ServerSite extends VirtualSite{

  }
  //邮件地址
  trait EmailSite extends VirtualSite{

  }
  //网站地址
  trait WebSite extends VirtualSite{

  }
  //电话
  trait Phone extends VirtualSite{

  }
  //微信
  trait Wechat extends VirtualSite{

  }
  //地理位置
  trait GeographicLocation extends Location{

  }
  //地理地点
  trait GeographicPoint extends GeographicLocation{

  }
  //地理区域
  trait GeographicArea extends GeographicLocation{

  }
  //经纬度
  trait LogitudeAndLatitude extends GeographicPoint{

  }
  //海拔
  trait Altitude extends GeographicPoint{

  }
  //政治区域
  trait GeopliticalArea extends GeographicArea{

  }
  //管理权限区域
  trait ManagementArea extends GeographicArea{

  }
  //设施
  trait Facility extends GeographicArea{

  }

  //有效期
  trait TermOfValidity{
    //def effectiveDate
    //def untilDate
  }
  //场所位置联系
  trait SiteLocation extends TermOfValidity with Site with GeographicLocation{

  }
  //场所结构
  trait SiteStructure extends Site{

  }
  //合成结构
  trait SiteCompossition extends SiteStructure{

  }
  //物理通信链接
  trait SiteCommunictionLink extends SiteStructure with TermOfValidity{

  }
*/
  //party,person,organization
  /*
  trait Party{

  }
  trait Person extends Party{

  }

  trait MaritalStatus extends Person{

  }
  trait MaritalStatusType extends MaritalStatus with Person{

  }
  trait Name extends Person {

  }
  trait NameType extends Name with Person{

  }
  trait Sex extends Person{

  }
  trait SexType extends Sex with Person{

  }
  //组织
  trait Organization extends Party{

  }
  trait LegalOrganization extends Organization{

  }
  trait InformalOrganization extends Organization{

  }
  //当事人类别
  trait PartyClassfication{

  }
  trait PersonClassfication extends PartyClassfication{

  }
  trait OrganizationClassfication extends PartyClassfication{

  }
  //角色
  trait PartyRole{

  }
  trait PersonRole extends PartyRole{

  }
  //雇员
  trait Employee extends PersonRole{

  }
  //家庭成员
  trait FamilyMember extends PersonRole{

  }
  //签约人
  trait Contracter extends PersonRole{

  }
  //联系人
  trait Contact extends PersonRole{

  }
  //组织角色
  trait OrganizationRole extends PartyRole{

  }
  //分销渠道
  trait DistributionCharmel extends OrganizationRole{

  }
  //代理商
  trait Argent extends DistributionCharmel{

  }
  //分销商
  trait Distributer extends DistributionCharmel{

  }
  //合作伙伴
  trait Partner extends OrganizationRole{

  }
  //竞争对手
  trait Regulatory extends OrganizationRole{

  }
  //供应商
  trait Supplier extends OrganizationRole{

  }
  //协会
  trait Association extends OrganizationRole{

  }
  //组织单位
  trait OrganizationUnit extends OrganizationRole{

  }
  //上级组织
  trait ParentOrganization extends OrganizationUnit{

  }
  //部门
  trait Department extends OrganizationUnit{

  }
  //分支结构
  trait Division extends OrganizationUnit{

  }
  //分公司
  trait Subsidiary extends OrganizationUnit{

  }
  //
  trait PartyRelationship{

  }
  trait PersonRelationship extends PartyRelationship{

  }
  trait Employment extends PersonRelationship{

  }
  trait CustomerRelationship extends PersonRelationship{

  }
  trait OrganizationContact extends PersonRelationship{

  }
  trait OrganizationRollup extends PersonRelationship{

  }
  trait DistributionChannelRelationship extends PersonRelationship{

  }
  trait Partnership extends PersonRelationship{

  }
  //
  trait OrganizationRelationship extends PartyRelationship{

  }
  */
  //产品
  /*
  trait Product{

  }
  //货物
  trait Cargo extends Product{

  }
  //服务
  trait Service extends Product{

  }
  //产品类别
  trait ProductCategory{

  }
  trait ProductUsageCategorization  extends ProductCategory{

  }
  trait ProductIndustryCategorization  extends ProductCategory{

  }
  trait ProductMaterialsCategorization  extends ProductCategory{

  }
  */

}
