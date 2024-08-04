
# Python Conditional Statements
score = 85

if score > 90:
    print("Grade A")
elif score > 75:
    print("Grade B")
else:
    print("Grade C or below")

lang = "java"
# słówko match działa w bardzo podobny sposób co switch w języku Java bądź JS
match lang:
    case "JavaScript":
        print("You can become a web developer.")

    case "Python":
        print("You can become a Data Scientist")

    case "PHP":
        print("You can become a backend developer")
    
    case "Solidity":
        print("You can become a Blockchain developer")

    case "Java":
        print("You can become a mobile app developer")
    case _:
        print("The language doesn't matter, what matters is solving problems.")


wiek = 64

if wiek >= 65:
    print("Możesz przejść na emeryturę")
else:
    print("Nie możesz przejść na emeryturę")

#W Python aby porównać 2 stringi tosuje się operator ==. 
slowo = nic
if slowo == "Nic":
    print("jest ok")
else:
   print("nie jest")
