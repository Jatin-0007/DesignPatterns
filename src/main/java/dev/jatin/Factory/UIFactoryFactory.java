package dev.jatin.Factory;

public class UIFactoryFactory {
    //Practical Factory(HELPER CLASS)

    public static UIFactory getUIFactoryForPlatform(SupportedPlatforms platforms){

        //no need to make object for this class as the method is static

        if(platforms.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        } else if(platforms.equals(SupportedPlatforms.IOS)){
            return new IosUIFactory();
        } else if(platforms.equals(SupportedPlatforms.WINDOWS)){
            return new WindowsUIFactory();
        }

        return null;

    }

}
