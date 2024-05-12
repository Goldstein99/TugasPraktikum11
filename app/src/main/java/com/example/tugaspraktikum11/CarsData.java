package com.example.tugaspraktikum11;

import android.media.Image;
import java.util.ArrayList;

public class CarsData {
    private static String[] carNames = {
            "Bugatti Chiron Super Sport",
            "Rimac Nevera",
            "Pininfarina Battista",
            "Lamborghini Sián",
            "Maserati MC20",
            "McLaren Artura",
            "Ferrari Monza",
            "Porsche 911 Turbo S",
            "Koenigsegg Jesko",
            "Aston Martin V12 Speedster"
    };

    private static String[] heroDetails = {
            "Behold: the world’s fastest production car. Yep, the go-faster Super Sport is based on the Bugatti Chiron that Andy Wallace piloted to 304.773mph back in 2019, and features an 8.0-litre quad-turbo V16 producing an extra 100bhp over the standard Chiron. All in, that’s 1,578bhp at your disposal. In fact, there’s just one difference to the Chiron which smashed the 300mph barrier – the top speed has been limited to a mere 273mph. But as Jack Rix will tell you, that’s plenty enough, especially at a sopping wet Nürburgring…",
            "The Nevera is astonishingly fast. Fast in a way that’s tricky to put into words, either while you’re sitting in it trying to process what the hell is happening to your mind, body and soul when you nail the throttle, or a few days later writing about it,” wrote Jason Barlow when he got the call to test drive the Rimac Nevera in Croatia last year. So allow us to hit you with some numbers instead: courtesy of a 120kWh battery, four motors driving each wheel individually, and a power output equivalent to 1,914bhp and 1,740lb ft of torque, Mate Rimac’s hypercar is capable of 0-60mph in 1.85 seconds, 100mph in 4.3secs, and 186mph in 9.3secs – on to a 258mph max. Ah dammit, we’re even more lost for words…",
            "Meet the sister car to the Rimac Nevera. It’s based around the same powertrain technology, electrical architecture and carbon core (Rimac supplies the internal gubbins), but wears an Italian frock of Pininfarina design. Worried about charging? No drama, Pininfarina has agreed a deal with ChargePoint, meaning free charging for five years. Which means, theoretically, if you get enough miles under your belt, you could break even on the £2m purchase price. Challenge accepted…",
            "With a name derived from the Bolognese dialect for lightning bolt, it’s no surprise that electrification is the Sián’s talking point, too. It features a tuned version of the Aventador SVJ’s 6.5-litre, naturally aspirated V12, with another 34bhp of electrical oomph (courtesy of lithium-ion supercapacitors) added for a total of 808bhp. And while that electroboost may not sound a whole lot in the grand scheme of things, it helps to smooth out the savage gearshifts that have plagued Lambos since the Aventador. We approve.",
            "Maserati’s latest rejuvenation plan starts here and if the MC20 is a sign of things to come, we’re mighty pleased about that, too. The Italian manufacturer’s first supercar since the MC12, it was conceived and launched in just 24 months, and all the while in the midst of a pandemic, too. Looks the part, doesn’t it? The mid-engined 3.0-litre V6, complete with F1-grade pre-chamber combustion tech and outputting 621bhp and 538lb ft of torque, is pretty handy too, while a pure electric-only powertrain is set to come later. Decisions, decisions….",
            "Meet the plug-in hybrid McLaren for the everyday. The numbers are as follows: 671bhp, 431lb ft of torque, 0-62mph in 3.0 seconds, 0-125 in 8.3, top speed 205mph. OK, arguably more then you need for the everyday, but you will at least get up to 20 miles of electric range from the 7.4kWh battery. Relief, at last, for the neighbours on those early morning starts – that is, if it ever arrives, with ongoing delays potentially set to see it superseded by the Ferrari 296 GTB…",
            "Say hello to Ferrari’s windscreen-less speedster. Yep, car manufacturers are on one at the moment when it comes to chucking the windscreen in the skip – as you’ll see later in this list – and the Monza was arguably the trendsetter. It’s offered in two body styles, either the single-seat SP1 for the anti-social type, or the dual-seat SP2 in case you’ve got any friends who’re mad enough to come along for the ride. The 6.5-litre nat-asp V12 engine is nicked from the 812 Superfast, but as we found on an excursion in the Scottish Highlands, it’s best driven in sunnier climes only.",
            "Remember our Speed Week Champion of 2020? We do. Because it left quite the impression on us all, not least Chris Harris. Come sunshine or showers, track, A-road, B-road, motorway, and with 641bhp and 590lbft to play with from its 3.7-litre twin-turbo flat-six, it ate them all up and still had room for dessert. On its way it beat the likes of the McLaren 765LT and the Ferrari F8, too – not bad for a comfy four-seat coupe with a big boot.",
            "Wouldn’t be a best supercar list without at least one Koenigsegg, would it – and we had plenty to choose from. But this one tugs on the heartstrings more than most, not least because Jesko is the name of boss Christian von Koenigsegg’s father, who helped him set up the company when he was just 22 years old. Beneath the skin lies a 5.0-litre twin-turbocharged engine and purpose-built nine-speed multi-clutch transmission, with the aim being to top the 310mph mark. Which, says CvK, will ultimately come down to location, tyres and whether the driver is brave enough to fully send it. No pressure.",
            "Another entrant in the windscreen-less-and-absolutely-bonkers-but-yet-we-love-it category is this, the V12 Speedster from Aston Martin. This is the one to have, however, if you’re going for that windswept surfer dude look – there’s little to protect your face, or hairdo, other than a pair of glass aero ramps. Under the bonnet is a 691bhp V12 (the clue’s in the name), while it’ll propel you from 0-62mph in 3.5 seconds and on to a top speed of 186mph. Which, with the wind in your face, will probably feel about triple that."
    };

    private static int[] carsImages = {
            R.drawable.bugatti_chiron,
            R.drawable.rimac_nevera,
            R.drawable.pininfarina_battista,
            R.drawable.lamborghini_sian,
            R.drawable.maserati_mc20,
            R.drawable.mclaren_artura,
            R.drawable.ferrari_monza,
            R.drawable.porsche_911_turbos,
            R.drawable.koenigsegg_jesko,
            R.drawable.aston_martin_v12
    };

    static ArrayList<com.example.tugaspraktikum11.Car> getListData() {
        ArrayList<com.example.tugaspraktikum11.Car> list = new ArrayList<>();
        for (int position = 0; position < carNames.length; position++) {
            com.example.tugaspraktikum11.Car car = new com.example.tugaspraktikum11.Car();
            car.setName(carNames[position]);
            car.setDetail(heroDetails[position]);
            car.setPhoto(carsImages[position]);
            list.add(car);
        }
        return list;
    }
}