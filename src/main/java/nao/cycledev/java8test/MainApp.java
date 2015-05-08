package nao.cycledev.java8test;

import nao.cycledev.java8test.streams.StreamTest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    private static final char COMMAND_SEPARATOR = 30;

    public static void main(String[] args) throws IOException, URISyntaxException {

        Map<String, String> parameters = new HashMap<>();

        //String str0 = "{resulttext={ \"TList\" : [{\"TE7User\":{\"notievntarrived\":true,\"ldapdomain\":\"\",\"notievntdeparted\":true,\"autonotification\":false,\"systemconnect\":true,\"loginrequired\":true,\"todelete\":false,\"barcodeidrequired\":false,\"notievntresolved\":true,\"loginname\":\"nop\",\"projectsdelegationallowed\":\"2\\r\\n\",\"logoutallowed\":true,\"extraparamsstr\":\"InChMAINTOOLPersonInCharge=P12456\\r\\nFELTENUSERID=0\\r\\nWEBFACTORYUSERID=\\r\\nPushSound=3: Classic iOS Alarm\\r\\nAndroidPushSound=2: Increase Volume\\r\\nMTmaximoperson=BORCHERS\\r\\nALSortOrder=priority\\r\\nMTWOSORT=WOPRIORITY desc\\r\\nMTmaximoSite=\\r\\nFilterAssemblyGroupID=0\\r\\nFilterParameterID=0\\r\\nFilterObjectID=0\\r\\nFilterNotificationID=0\\r\\nFilterStoredFilterID=0\\r\\nFilterProjectID=0\\r\\n\",\"trendconnect\":true,\"isbusy\":false,\"ldapdistinguishedname\":\"\",\"ldaptype\":0,\"languageid\":2,\"projectidsstr\":\"1\\r\\n\",\"id\":24,\"logintimeout\":0,\"email\":\"\",\"notificationconnect\":true,\"busystatetimeoutinminutes\":0,\"locked\":false,\"communicationconnect\":true,\"name\":\"Nazar Oprysk\",\"notievntconfirmed\":true,\"layoutid\":1,\"authorizationsstr\":\"uaSCADAView=1\\r\\nuaSCADALinks=1\\r\\nuaSCADAAlarmHistory=1\\r\\nuaAlarmView=1\\r\\nuaAlarmLinks=1\\r\\nuaAlarmEditStatus=1\\r\\nuaAlarmShowHistory=1\\r\\nuaAlarmEnableFilter=1\\r\\nuaAssetView=1\\r\\nuaAssetLinks=1\\r\\nuaAssetWorkOrderHistory=1\\r\\nuaAssetBOM=1\\r\\nuaAssetAlarmHistory=1\\r\\nuaWOView=1\\r\\nuaWOEditStatus=1\\r\\nuaWOCreate=1\\r\\nuaWOBookLabor=1\\r\\nuaWOBookMaterial=1\\r\\nuaWOPCR=1\\r\\nuaWOEditLog=1\\r\\nuaPMView=1\\r\\nuaPMEditStatus=1\\r\\nuaPMBookLabor=1\\r\\nuaPMBookMaterial=1\\r\\n\",\"notificationintv\":0,\"notievntcancelled\":true,\"deviceconnect\":true,\"allowsetbusy\":true}}]}";
        String str = "\"notievntarrived\":true,\"ldapdomain\":\"\",\"notievntdeparted\":true,\"autonotification\":false,\"systemconnect\":true,\"loginrequired\":true,\"todelete\":false,\"barcodeidrequired\":false,\"notievntresolved\":true,\"loginname\":\"nop\",\"projectsdelegationallowed\":\"2\\r\\n\",\"logoutallowed\":true,\"extraparamsstr\":\"InChMAINTOOLPersonInCharge=P12456\\r\\nFELTENUSERID=0\\r\\nWEBFACTORYUSERID=\\r\\nPushSound=3: Classic iOS Alarm\\r\\nAndroidPushSound=2: Increase Volume\\r\\nMTmaximoperson=BORCHERS\\r\\nALSortOrder=priority\\r\\nMTWOSORT=WOPRIORITY desc\\r\\nMTmaximoSite=\\r\\nFilterAssemblyGroupID=0\\r\\nFilterParameterID=0\\r\\nFilterObjectID=0\\r\\nFilterNotificationID=0\\r\\nFilterStoredFilterID=0\\r\\nFilterProjectID=0\\r\\n\",\"trendconnect\":true,\"isbusy\":false,\"ldapdistinguishedname\":\"\",\"ldaptype\":0,\"languageid\":2,\"projectidsstr\":\"1\\r\\n\",\"id\":24,\"logintimeout\":0,\"email\":\"\",\"notificationconnect\":true,\"busystatetimeoutinminutes\":0,\"locked\":false,\"communicationconnect\":true,\"name\":\"Nazar Oprysk\",\"notievntconfirmed\":true,\"layoutid\":1,\"authorizationsstr\":\"uaSCADAView=1\\r\\nuaSCADALinks=1\\r\\nuaSCADAAlarmHistory=1\\r\\nuaAlarmView=1\\r\\nuaAlarmLinks=1\\r\\nuaAlarmEditStatus=1\\r\\nuaAlarmShowHistory=1\\r\\nuaAlarmEnableFilter=1\\r\\nuaAssetView=1\\r\\nuaAssetLinks=1\\r\\nuaAssetWorkOrderHistory=1\\r\\nuaAssetBOM=1\\r\\nuaAssetAlarmHistory=1\\r\\nuaWOView=1\\r\\nuaWOEditStatus=1\\r\\nuaWOCreate=1\\r\\nuaWOBookLabor=1\\r\\nuaWOBookMaterial=1\\r\\nuaWOPCR=1\\r\\nuaWOEditLog=1\\r\\nuaPMView=1\\r\\nuaPMEditStatus=1\\r\\nuaPMBookLabor=1\\r\\nuaPMBookMaterial=1\\r\\n\",\"notificationintv\":0,\"notievntcancelled\":true,\"deviceconnect\":true,\"allowsetbusy\":true";

        List<String> cmdParameters = Arrays.asList(str.split(String.valueOf(",")));
        cmdParameters.stream()
                .forEach(cmdParameter -> parameters.put(cmdParameter.substring(0, cmdParameter.indexOf(":")).replace("\"", ""), cmdParameter.substring(cmdParameter.indexOf(":") + 1).replace("\"", "")));

        List<String> extraParams = Arrays.asList(parameters.get("extraparamsstr").split("\\\\r?\\\\n"));
        extraParams.stream()
                .forEach(extraParam -> parameters.put(extraParam.substring(0, extraParam.indexOf("=")), extraParam.substring(extraParam.indexOf("=") + 1)));
        parameters.remove("extraparamsstr");


        List<String> authParams = Arrays.asList(parameters.get("authorizationsstr").split("\\\\r?\\\\n"));
        authParams.stream()
                .forEach(authParam -> parameters.put(authParam.substring(0, authParam.indexOf("=")), authParam.substring(authParam.indexOf("=") + 1)));
        parameters.remove("authorizationsstr");

        cmdParameters.stream()
                .forEach(cmdParameter -> parameters.put(cmdParameter.substring(0, cmdParameter.indexOf(":")).replace("\"", ""), cmdParameter.substring(cmdParameter.indexOf(":") + 1).replace("\"", "")));


        parameters.forEach((s1, s2) -> System.out.println(s1 + ": " + s2));

    }


    private static void parseExtra(){

        String extraStr = "InChMAINTOOLPersonInCharge=P12456\\r\\nFELTENUSERID=0\\r\\nWEBFACTORYUSERID=\\r\\nPushSound=3: Classic iOS Alarm\\r\\nAndroidPushSound=2: Increase Volume\\r\\nMTmaximoperson=BORCHERS\\r\\nALSortOrder=priority\\r\\nMTWOSORT=WOPRIORITY desc\\r\\nMTmaximoSite=\\r\\nFilterAssemblyGroupID=0\\r\\nFilterParameterID=0\\r\\nFilterObjectID=0\\r\\nFilterNotificationID=0\\r\\nFilterStoredFilterID=0\\r\\nFilterProjectID=0\\r\\n";

        List<String> extras = Arrays.asList(extraStr.split("\\\\r?\\\\n"));

        extras.forEach(System.out::println);



    }
}
