package spring.PapuyectoColegio.utils;

public class Constants {
    public enum MESSAGES {

        SUCCESS_TRANSACTION("Succesful transaction.", "00"),
        SUCCESSFUL_QUERY("Successful query.", "00"),
        SUCCESSFUL_UPDATE("Registration correctly updated", "00"),
        SUCCESSFUL_REGISTRATION("Registration successfully created", "00"),
        DECLINE_TRANSACTION("Decline transaction.", "99"),
        INCOMPLETE_DATA("Incomplete data to carry out the transaction.", "HE01"),
        SYSTEM_FAILURE("System failure.", "HE03"),
        FAIL_UPDATE("System failure updating", "HE08"),
        FAIL_QUERY("Query failed.", "HE04"),
        INCORRECT_REQUEST("Incorrect Request.", "HE05"),
        FORBIDDEN_ACCESS("Insufficient permits", "HE06"),
        UNAUTHORIZED_ACCESS("Wrong credentials", "HE07"),
        TRANSACTION_DECLINED("Transaction declined", "HE11"),
        FAIL_QUERY_AGREEMENT_BDI("There are no conventions associated with this reference.", "HE13"),
        NO_RESULTS_FOUND("No results found.", "HE12"),
        TIME_OUT("Connection timeout.", "HE14"),
        REDIS_QUERY_ID_ERROR("The quote has already expired or is invalid", "RE01");



        private String tag;
        private String code;

        public static MESSAGES getMessageForCode(String code) {
            MESSAGES message = MESSAGES.SUCCESS_TRANSACTION;
            for (MESSAGES m : MESSAGES.values()) {
                if (m.getCode().equals(code)) {
                    message = m;
                    break;
                }
            }
            return message;
        }

        private MESSAGES(String tag, String code) {
            this.tag = tag;
            this.code = code;
        }

        public String getTag() {
            return this.tag;
        }

        public String getCode() {
            return this.code;
        }

        public static String getCodeByMsg(String s) {
            String code = MESSAGES.SYSTEM_FAILURE.getCode();
            for (MESSAGES m : MESSAGES.values()) {
                if (m.getTag().equals(s)) {
                    code = m.getCode();
                }
            }
            return code;
        }

    }
}
