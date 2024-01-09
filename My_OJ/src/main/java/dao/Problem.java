package dao;
/*
* 突然发现这个人想法还挺宏伟的,最初是想整成 leetcode 那种的
* codeTemplate 是给你现成的代码模板
* 然后codeTest 是用于后面对程序的编译,初始化之类的
* 要是是前面在加上一些依赖对应的数据结构,后面在实现一个完全正确的代码对拍的化
* 就基本是实现了leetcode的内容了 */
public class Problem {
    private int id;
    // 题目的id 自增 不要管
    private String title;
    // 题目名称
    private String level;
    // 等级
    private String description;
    // 题干
    private String codeTemplate;
    // 给出的现成的代码模板
    private String codeTest;
    // main 函数堆放的地方
    public  Problem (String title,String level,String description,String codeTest,String codeTemplate) {
        this.title = title;
        this.level = level;
        this.description = description;
        this.codeTest = codeTest;
        this.codeTemplate = codeTemplate;
    }
    Problem (){

    }
    @Override
    public String toString() {
        return "Problem{" +
                "id=" + getId() +
                ", title='" + title + '\'' +
                ", level='" + level + '\'' +
                ", description='" + description + '\'' +
                ", codeTemplate='" + codeTemplate + '\'' +
                ", codeTest='" + codeTest + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodeTemplate() {
        return codeTemplate;
    }

    public void setCodeTemplate(String codeTemplate) {
        this.codeTemplate = codeTemplate;
    }

    public String getCodeTest() {
        return codeTest;
    }

    public void setCodeTest(String codeTest) {
        this.codeTest = codeTest;
    }
}
