package _2024;

import java.util.Arrays;
import java.util.List;

class Stud {
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    public Stud(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Stud{" + "sid=" + sid + ", sname='" + sname + '}';
    }

    int sid;
    String sname;
    //each student belongs to college
//    College college;
}

class College {
    int cid;
    String cname;

    @Override
    public String toString() {
        return "College{" + "cid=" + cid + ", cname='" + cname + '\'' + ", studentList=" + studentList + '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Stud> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Stud> studentList) {
        this.studentList = studentList;
    }

    public College(int cid, List<Stud> studentList, String cname) {
        this.cid = cid;
        this.studentList = studentList;
        this.cname = cname;
    }

    //college has many students
    List<Stud> studentList;
}

public class Composition_HAS_A {
    public static void main(String[] args) {
        List<College> collegeList = List.of(new College(1, List.of(new Stud(1, "B")), "A"));
        collegeList.stream().filter(c->c.getCid()==1).flatMap(c->c.getStudentList().stream()).filter(s->s.getSname().startsWith("A")).toList();
    }
}
