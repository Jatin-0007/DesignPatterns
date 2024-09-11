package dev.jatin.Factory;

public class Flutter {
//    private String platform;
//
//    public Flutter(String platform) {
//        this.platform=platform;
//    }

    //Non Factory methods

    void refreshUI(){
        System.out.println("Refresh UI");
    }

    void setTheme(){
        System.out.println("Set Theme");
    }

    public UIFactory getUIFactory(SupportedPlatforms platform){

        return UIFactoryFactory.getUIFactoryForPlatform(platform);


//        if(platform.equals(SupportedPlatforms.ANDROID)){
//            return new AndroidUIFactory();
//        } else if(platform.equals(SupportedPlatforms.IOS)){
//            return new IosUIFactory();             -------->> these if-else conditions are sent to UIFactoryFactory class to make our flutter class
                                                                // more optimised so not to violate SOLID principals
//        } else if(platform.equals(SupportedPlatforms.WINDOWS)){
//            return new WindowsUIFactory();
//        }
//
//        return null;


    }
}
