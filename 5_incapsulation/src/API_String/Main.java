package API_String;

public class Main {
    public static void main(String[] args) {
        String text ="Molly Moon looked down at her pink, blotchy legs. It wasn't the bathwater that was making them mottled like Spam; they were always that color. And so skinny. Maybe one day, like an ugly duckling turning into a swan, her knock-kneed legs might grow into the most beautiful legs in the world. Some hope. \n" +
                "\n" +
                "Molly leaned back until her curly brown hair and her ears were under the water. She stared at the fly-specked yellow paint that was peeling off the wall and at the damp patch on the ceiling where strange mushrooms grew. Water filled her ears and the world sounded foggy and far away. \n" +
                "\n" +
                "Molly shut her eyes. It was an ordinary November evening, and she was in a shabby bathroom in a crumbling building called the Hardwick House Orphanage. She imagined flying over it like a bird, looking down at its gray slate roof and its bramble-filled garden. She imagined flying higher until she was looking down on the hillside where Hardwick village lay. Up and up she went until Hardwick House became tiny. She could see the whole of the town of Briersville beyond it. As Molly flew higher and higher, she saw the rest of the country and now the coastline, too, with sea on all sides. Her mind rocketed upward until she was flying in space, looking down at the earth. And there she hovered. Molly liked to fly away from the world in her imagination. It was relaxing. \n" +
                "\n" +
                "Molly had this special feeling tonight, as if something exciting or strange were about to happen to her. The last time she'd felt special, she'd found a half-eaten packet of candy on the pavement in the village. The time before, she'd got away with watching two hours of evening television instead of one. Molly wondered what surprise would greet her this time. Then she opened her eyes and was back in the bath. She looked at her distorted reflection in the underside of the chrome tap. Oh dear. Surely she wasn't as ugly as that? Was that pink lump of dough her face? Was that potato her nose? Were those small green lights her eyes? \n" +
                "\n" +
                "Someone was hammering downstairs. That was strange; no one ever mended anything in Hardwick House. Then Molly realized that the hammering was someone banging on the bathroom door. Trouble. Molly shot up and hit her head on the tap. The banging outside was very loud now and with it came a fierce bark. \n" +
                "\n" +
                "\"Molly Moon, open this door at once! If you don't, I'll be forced to use a master key.\" \n" +
                "\n" +
                "Molly could hear keys rattling on a ring. She looked at the level of her bathwater and gasped. It was much too deep and well over the allowed level. She pulled the plug out and wrapped herself in her towel. Just in time. The door swung open. Miss Adderstone was in and darting like an adder to the bathtub, her scaly nose wrinkling as she discovered the deep, draining water. She rolled up her sleeve and pushed the plug back in. \n" +
                "\n" +
                "\"As I suspected,\" she hissed. \"Intentional flouting of orphanage rules.\" \n" +
                "\n" +
                "Miss Adderstone's eyes glinted spitefully as she took a tape measure from her pocket. She pulled the metal strip out and, making excited slurping noises as she sucked on her loose false teeth, she measured how far Molly's bath had gone over the red line painted round the sides of the tub. Molly's teeth chattered. Her knees were now turning blue and blotchy, and the palms of her hands began sweating, as they always did whenever she was nervous. \n" +
                "\n" +
                "\"Your bath is thirty centimeters deep,\" Miss Adderstone announced. \"Allowing for the amount that had already been deceitfully run out while I was knocking at the door, I calculate that your bath was actually forty centimeters deep. You know that baths are only supposed to be ten centimeters deep. Your bath was four times that deep, so you have, in effect, used up your next three baths. So, Molly, you are forbidden to have a bath for the next three weeks. As for a punishment . . .\" Miss Adderstone picked up Molly's toothbrush. Molly's heart sank. She knew what was coming next. ";
 char ch = 'a';
 int i = 0;
 while (i!= text.length()-1 ){
     i = text.indexOf(ch,i);
        System.out.println(i);
        if(i == -1){
           break;

       }i++;
   }
}}
