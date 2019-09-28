public class Main {
    public static void main(String[] args) {
        Tele2Tarrif myOnline = new Tele2Tarrif();
        myOnline.id = 1;
        myOnline.Name = "Мой онлайн";
        myOnline.price = 29000;
        myOnline.timePeriod = "month";
        myOnline.freeInternetLimitInGb = 15000;
        myOnline.isUnlimitedForSocialAndMessenger = true;
        myOnline.internetPricePerUnit = 5000;
        myOnline.internetUnitInMB = 500;

        myOnline.freeVoiceLimitInMin = 400;
        myOnline.isFreeForTele2 = true;
        myOnline.pricePerVoiceUnit = 195;
        myOnline.voiceUnit="min";

        myOnline.freeSmsLimit = 0;
        myOnline.pricePerSmsUnit =  195;
        myOnline.smsUnit="message"

        Tele2Tarrif unlim = new Tele2Tarrif();
        unlim.id = 2;
        unlim.Name = "Безлимит";
        unlim.price =  400;
        unlim.timePeriod = "month";
        unlim.freeInternetLimitInGb = -1;
        unlim.isUnlimitedForSocialAndMessenger = true;
        unlim.internetPricePerUnit = 0;
        unlim.internetUnitInMB = 0;

        unlim.freeVoiceLimitInMin = 500;
        unlim.isFreeForTele2 = true;
        unlim.pricePerVoiceUnit = 195;
        unlim.voiceUnit="min";

        unlim.freeSmsLimit = 50;
        unlim.pricePerSmsUnit =  195;
        unlim.smsUnit="message";

        Tele2Tarrif myTele2 = new Tele2Tarrif();
        myTele2.id = 3;
        myTele2.Name = "Мой Теле 2";
        myTele2.price =  700;
        myTele2.timePeriod = "day";
        myTele2.freeInternetLimitInGb = 6;
        myTele2.isUnlimitedForSocialAndMessenger = true;
        myTele2.internetPricePerUnit = 5000;
        myTele2.internetUnitInMB = 500;

        myTele2.freeVoiceLimitInMin = 0;
        myTele2.isFreeForTele2 = true;
        myTele2.pricePerVoiceUnit = 195;
        myTele2.voiceUnit="min";

        myTele2.freeSmsLimit = 0;
        myTele2.pricePerSmsUnit =  195;
        myTele2.smsUnit="message";


    }
}
