class Departamento:
    def __init__(self, nombre, area):
        self.nombre = nombre
        self.area = area
        self.empleados = []
    
    def agregar_empleado(self, empleado):
        self.empleados.append(empleado)
    
    def mostrar_empleados(self):
        print(f"Departamento {self.nombre}:")
        for emp in self.empleados:
            print(f"{emp.nombre} - {emp.cargo} - ${emp.sueldo}")
        if not self.empleados:
            print("Sin empleados")
        print()
    
    def cambiar_salario(self, porcentaje):
        for emp in self.empleados:
            emp.sueldo *= (1 + porcentaje/100)

class Empleado:
    def __init__(self, nombre, cargo, sueldo):
        self.nombre = nombre
        self.cargo = cargo
        self.sueldo = sueldo

departamento1 = Departamento("Ventas", "Comercial")
departamento2 = Departamento("RH", "Administración")

empleados_dep1 = [
    Empleado("Ana García", "Vendedor", 30000),
    Empleado("Carlos López", "Gerente", 50000),
    Empleado("María Rodríguez", "Asistente", 25000),
    Empleado("Pedro Martínez", "Vendedor", 30000),
    Empleado("Laura Sánchez", "Supervisor", 40000)
]

for emp in empleados_dep1:
    departamento1.agregar_empleado(emp)

print("Empleados iniciales:")
departamento1.mostrar_empleados()
departamento2.mostrar_empleados()

departamento1.cambiar_salario(10)

empleados_comunes = [emp for emp in departamento1.empleados if emp in departamento2.empleados]
print(f"Empleados en común: {len(empleados_comunes)}")

for emp in departamento1.empleados[:]:
    departamento2.agregar_empleado(emp)
departamento1.empleados.clear()

print("Después de mover empleados:")
departamento1.mostrar_empleados()
departamento2.mostrar_empleados()