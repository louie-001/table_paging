package self.louie.table.bean;


import javax.persistence.*;
import java.math.BigInteger;

/**
 * 说明：用户实体
 * @author louie
 * @date 2017/12/19
 */
@Entity
@Table(name = "ORGUSER")
public class User {
    private long id;
    private String userid;
    private String password;
    private Long departmentid;
    private Long roleid;
    private BigInteger disenable;
    private Long sessiontime;
    private String username;
    private BigInteger linenumber;
    private long logincounter;
    private BigInteger ismanager;
    private String officetel;
    private String officefax;
    private String hometel;
    private String mobile;
    private String email;
    private String jjlinkman;
    private String jjtel;
    private String userno;
    private long orderindex;
    private BigInteger isiplogin;
    private String userip;
    private BigInteger isroving;
    private String extend1;
    private String extend2;
    private BigInteger issinglelogin;
    private String workStatus;
    private String smid;
    private String pcMan;
    private String awspass;
    private String emailpass;
    private String layoutModel;
    private String positionNo;
    private String positionName;
    private String positionLayer;
    private String extend3;
    private String extend4;
    private String extend5;
    private String msnid;
    private String workcanlendar;
    private String integrateid;

    @Basic
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    @Column(name = "USERID", nullable = false, length = 30)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "DEPARTMENTID", nullable = true)
    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

    @Basic
    @Column(name = "ROLEID", nullable = true)
    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    @Basic
    @Column(name = "DISENABLE", nullable = false, precision = 0)
    public BigInteger getDisenable() {
        return disenable;
    }

    public void setDisenable(BigInteger disenable) {
        this.disenable = disenable;
    }

    @Basic
    @Column(name = "SESSIONTIME", nullable = true)
    public Long getSessiontime() {
        return sessiontime;
    }

    public void setSessiontime(Long sessiontime) {
        this.sessiontime = sessiontime;
    }

    @Basic
    @Column(name = "USERNAME", nullable = true, length = 30)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "LINENUMBER", nullable = false, precision = 0)
    public BigInteger getLinenumber() {
        return linenumber;
    }

    public void setLinenumber(BigInteger linenumber) {
        this.linenumber = linenumber;
    }

    @Basic
    @Column(name = "LOGINCOUNTER", nullable = false)
    public long getLogincounter() {
        return logincounter;
    }

    public void setLogincounter(long logincounter) {
        this.logincounter = logincounter;
    }

    @Basic
    @Column(name = "ISMANAGER", nullable = true, precision = 0)
    public BigInteger getIsmanager() {
        return ismanager;
    }

    public void setIsmanager(BigInteger ismanager) {
        this.ismanager = ismanager;
    }

    @Basic
    @Column(name = "OFFICETEL", nullable = true, length = 30)
    public String getOfficetel() {
        return officetel;
    }

    public void setOfficetel(String officetel) {
        this.officetel = officetel;
    }

    @Basic
    @Column(name = "OFFICEFAX", nullable = true, length = 20)
    public String getOfficefax() {
        return officefax;
    }

    public void setOfficefax(String officefax) {
        this.officefax = officefax;
    }

    @Basic
    @Column(name = "HOMETEL", nullable = true, length = 20)
    public String getHometel() {
        return hometel;
    }

    public void setHometel(String hometel) {
        this.hometel = hometel;
    }

    @Basic
    @Column(name = "MOBILE", nullable = true, length = 15)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "JJLINKMAN", nullable = true, length = 50)
    public String getJjlinkman() {
        return jjlinkman;
    }

    public void setJjlinkman(String jjlinkman) {
        this.jjlinkman = jjlinkman;
    }

    @Basic
    @Column(name = "JJTEL", nullable = true, length = 50)
    public String getJjtel() {
        return jjtel;
    }

    public void setJjtel(String jjtel) {
        this.jjtel = jjtel;
    }

    @Basic
    @Column(name = "USERNO", nullable = true, length = 320)
    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    @Basic
    @Column(name = "ORDERINDEX", nullable = false)
    public long getOrderindex() {
        return orderindex;
    }

    public void setOrderindex(long orderindex) {
        this.orderindex = orderindex;
    }

    @Basic
    @Column(name = "ISIPLOGIN", nullable = false, precision = 0)
    public BigInteger getIsiplogin() {
        return isiplogin;
    }

    public void setIsiplogin(BigInteger isiplogin) {
        this.isiplogin = isiplogin;
    }

    @Basic
    @Column(name = "USERIP", nullable = true, length = 128)
    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip;
    }

    @Basic
    @Column(name = "ISROVING", nullable = false, precision = 0)
    public BigInteger getIsroving() {
        return isroving;
    }

    public void setIsroving(BigInteger isroving) {
        this.isroving = isroving;
    }

    @Basic
    @Column(name = "EXTEND1", nullable = true, length = 50)
    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    @Basic
    @Column(name = "EXTEND2", nullable = true, length = 50)
    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    @Basic
    @Column(name = "ISSINGLELOGIN", nullable = true, precision = 0)
    public BigInteger getIssinglelogin() {
        return issinglelogin;
    }

    public void setIssinglelogin(BigInteger issinglelogin) {
        this.issinglelogin = issinglelogin;
    }

    @Basic
    @Column(name = "WORK_STATUS", nullable = true, length = 32)
    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    @Basic
    @Column(name = "SMID", nullable = true, length = 16)
    public String getSmid() {
        return smid;
    }

    public void setSmid(String smid) {
        this.smid = smid;
    }

    @Basic
    @Column(name = "PC_MAN", nullable = true, length = 64)
    public String getPcMan() {
        return pcMan;
    }

    public void setPcMan(String pcMan) {
        this.pcMan = pcMan;
    }

    @Basic
    @Column(name = "AWSPASS", nullable = true, length = 256)
    public String getAwspass() {
        return awspass;
    }

    public void setAwspass(String awspass) {
        this.awspass = awspass;
    }

    @Basic
    @Column(name = "EMAILPASS", nullable = true, length = 256)
    public String getEmailpass() {
        return emailpass;
    }

    public void setEmailpass(String emailpass) {
        this.emailpass = emailpass;
    }

    @Basic
    @Column(name = "LAYOUT_MODEL", nullable = true, length = 32)
    public String getLayoutModel() {
        return layoutModel;
    }

    public void setLayoutModel(String layoutModel) {
        this.layoutModel = layoutModel;
    }

    @Basic
    @Column(name = "POSITION_NO", nullable = true, length = 16)
    public String getPositionNo() {
        return positionNo;
    }

    public void setPositionNo(String positionNo) {
        this.positionNo = positionNo;
    }

    @Basic
    @Column(name = "POSITION_NAME", nullable = true, length = 32)
    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Basic
    @Column(name = "POSITION_LAYER", nullable = true, length = 32)
    public String getPositionLayer() {
        return positionLayer;
    }

    public void setPositionLayer(String positionLayer) {
        this.positionLayer = positionLayer;
    }

    @Basic
    @Column(name = "EXTEND3", nullable = true, length = 32)
    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }

    @Basic
    @Column(name = "EXTEND4", nullable = true, length = 32)
    public String getExtend4() {
        return extend4;
    }

    public void setExtend4(String extend4) {
        this.extend4 = extend4;
    }

    @Basic
    @Column(name = "EXTEND5", nullable = true, length = 32)
    public String getExtend5() {
        return extend5;
    }

    public void setExtend5(String extend5) {
        this.extend5 = extend5;
    }

    @Basic
    @Column(name = "MSNID", nullable = true, length = 32)
    public String getMsnid() {
        return msnid;
    }

    public void setMsnid(String msnid) {
        this.msnid = msnid;
    }

    @Basic
    @Column(name = "WORKCANLENDAR", nullable = true, length = 40)
    public String getWorkcanlendar() {
        return workcanlendar;
    }

    public void setWorkcanlendar(String workcanlendar) {
        this.workcanlendar = workcanlendar;
    }

    @Basic
    @Column(name = "INTEGRATEID", nullable = true, length = 32)
    public String getIntegrateid() {
        return integrateid;
    }

    public void setIntegrateid(String integrateid) {
        this.integrateid = integrateid;
    }


}
