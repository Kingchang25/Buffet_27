import requests



# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer
name = input("What Pokemon would you like to learn about: ")
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/"+name).json()
print("Name of the pokemon: "+pokemon["name"])
print("Pokedex id: "+ str(pokemon["id"]))
print("Weight: "+str(pokemon["weight"]))
print("Height: "+str(pokemon["height"]))
print("Ability:", pokemon["abilities"][0]["ability"]["name"])
print("Ability:", pokemon["abilities"][1]["ability"]["name"])