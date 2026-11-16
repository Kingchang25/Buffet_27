import random
joke = random.randrange(0,10)
question = input("would you like to hear a joke? (y/n): ")
jokes = ["Parallel lines have so much in common, it's a shame they'll never meet.", "Did you hear about the shepherd who drove his sheep through town? He got a ticket for making a ewe turn.", "What happens to an illegally parked frog? It gets toad away.","Don't you hate it when someone answers their own questions? I do.", "The shinbone is a device for finding furniture in a dark room.", "I have a fear of speed bumps, but I'm slowly getting over it.", "I used to be addicted to soap, but I'm clean now.", "I was going to tell a time-traveling joke, but you guys didn't like it.", "I told my wife she was drawing her eyebrows too high. She looked surprised.", "I have a split personality,said Tom, being Frank."]
if question == "y":
    print(jokes[joke])
else:
    print("Okay, maybe next time!")