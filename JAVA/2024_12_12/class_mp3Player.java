//5.MP3Player class를 구현하고 다양한 기능 만들기

package day241212_class;

public class class_mp3Player {
    public static void main(String[] args) {
        MP3Player iPod = new MP3Player("iPod");

        iPod.on(iPod.onoff);

        iPod.volumeUp(iPod.volume);
        iPod.volumeUp(iPod.volume);
        iPod.volumeUp(iPod.volume);

        iPod.volumeDown(iPod.volume);

        System.out.println(iPod.toString());

    }
}

class MP3Player{
    String model = "";
    int volume = 0;
    boolean onoff = false;

    public MP3Player(String model) {
        this.model = model;
    }

    //1)전원 켜기
    public void on(boolean onoff){
        if(!onoff){
            this.onoff = true;
            this.volume = 40;
        }
    }

    //2)전원 끄기
    public void off(boolean onoff){
        if(onoff){
            this.onoff = false;
            this.volume = 0;
        }
    }
    //3)볼륨 증가 : 최대 100
    public void volumeUp(int volume){
        if (this.volume <= 80){
            this.volume += 20;
        } else {
            System.out.println("MAX Volume");
        }
    }

    //4)볼륨 감소 : 최소0
    public void volumeDown(int volume){
        if(this.volume >= 20){
            this.volume -= 20;
        } else {
            System.out.println("MIN Volume");
        }
    }

    //5)전체 내용을 출력하기 위한 메서드
    @Override
    public String toString() {
        return "MP3Player{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                ", onoff=" + onoff +
                '}';
    }
}
