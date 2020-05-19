package Q_1_60.Q7;

//public interface Exportable {
//    void export(); //interface de access modifier vermesek te implicitly olarak "public" tir.
//}
//
//
//class Tool implements Exportable {
//// protected void export() {   //line nl //soruda bu sekilde
//public void export() {
//    System.out.println("Tool::export");
//    }
//}
//class ReportTool extends Tool implements Exportable {
//    public void export() {                      // line n2
//        System.out.println("RTool::export");
//    }
//
//    public static void main(String[] args) {
//        Tool aTool = new ReportTool();
//        Tool bTool = new Tool();
//        callExport(aTool);
//        callExport(bTool);
//    }
//
//    public static void callExport(Exportable ex) {
//        ex.export();
//
//    }
//}
// What is the result?
// A. Compilation fails only at line n2.
// B. RTool:exportTool::export
// C. Tool::exportTool:export
// D. Compilation fails only at line n1.
// E. Compilation fails at both line n1 and line n2.
//
// Answer: D
// Ama soruda D 'nin uzeri renklendirilmis

//second version
//public interface Exportable {
//  public void export();
//}
//
//class Tool implements Exportable {
//       public void export() {   //line nl
//        System.out.println("Tool::export");
//    }
//}
//class ReportTool extends Tool implements Exportable {
//     void export() {                      // line n2
//        System.out.println("RTool::export");
//    }
//
//    public static void main(String[] args) {
//        Tool aTool = new ReportTool();
//        Tool bTool = new Tool();
//        callExport(aTool);
//        callExport(bTool);
//    }
//
//    public static void callExport(Exportable ex) {
//        ex.export();
//
//    }
//}
//line 2 de hata verir.