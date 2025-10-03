class Persona:
    def __init__(self, nombre, paterno, materno, edad, ci):
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.edad = edad
        self.ci = ci
    
    def mostrar_datos(self):
        return f"Nombre: {self.nombre} {self.paterno} {self.materno}\nEdad: {self.edad} años\nCI: {self.ci}"
    
    def mayor_de_edad(self):
        return self.edad >= 18
    
    def modificar_edad(self, nueva_edad):
        if nueva_edad >= 0:
            self.edad = nueva_edad
            return f"Edad actualizada a {self.edad} años"
        else:
            return "Error: La edad no puede ser negativa"
    
    def mismo_paterno(self, otra_persona):
        return self.paterno == otra_persona.paterno

# Instanciar dos personas
persona1 = Persona("Ana", "Gonzales", "Lopez", 25, "1234567")
persona2 = Persona("Carlos", "Gonzales", "Martinez", 17, "7654321")

print("=== PERSONA 1 ===")
print(persona1.mostrar_datos())
print(f"¿Mayor de edad? {persona1.mayor_de_edad()}")

print("\n=== PERSONA 2 ===")
print(persona2.mostrar_datos())
print(f"¿Mayor de edad? {persona2.mayor_de_edad()}")

print(f"\n¿Mismo apellido paterno? {persona1.mismo_paterno(persona2)}")
print(persona2.modificar_edad(20))
print(f"¿Mayor de edad ahora? {persona2.mayor_de_edad()}")