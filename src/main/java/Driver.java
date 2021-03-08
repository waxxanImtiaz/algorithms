//import java.util.TreeMap;
//import java.util.TreeSet;
//
//public class Driver {
//    public static void main(String[] args) {
//
////        Node tree = NodeUtils.getTree();
////
////        TreeSet<Node> node = new TreeSet<Node>();
////
////        while (tree.getLeft()!= null){
////
////        }
////
//
//        System.out.println(getTrasactionStatus("Success"));
//
//    }
//    public static String getTrasactionStatus(final String status){
//
//        if (status.equals(TransactionStatus.F)){
//            return "E";
//        }
//        if (status.equals(TransactionStatus.S))
//            return "S";
//        if (status.equals(TransactionStatus.P))
//            return "C";
//
//        return status;
//    }
//    private boolean compareNodeValues(final Node node1,final Node node2){
//        return node1.getValue().equals(node2.getValue());
//    }
//}
//enum TransactionStatus {
//    S("Success"),E("Error"),F("Failed"),P("Pending"),T("Terminated"),U("Submitted"),UK("Unkown"),AC("Active Schedule"),SU("Suspended Schedule"),CANCELLED("Cancelled"),REJECTED("Rejected");
//    private String description;
//    /*
//        S-Success: Operation completed
//        E-Error: Operation failed due to system exception
//        F-Failed: Operation failed due to business reason (i.e. host exception, insufficient balance, etc.)
//        P-Pending: Transaction request is pending for approval
//        U-Submitted: Transaction is submitted for scheduled execution (future dated or recurring)
//        T-Terminated: Scheduled transaction is terminated and will not be executed
//        AC-Active Schedule: Scheduled transaction is now for execution
//        SU-Suspended Schedule: Scheduled transaction for execution has been suspended
//        REJECTED-Rejected: Transaction request is explicitly rejected by approver.
//        CANCELLED-Cancelled: Transaction request is explicitly cancelled by requestor.
//    */
//
//    TransactionStatus(String description){
//        this.description = description;
//    }
//    public String getDescription() {
//        return description;
//    }
//}