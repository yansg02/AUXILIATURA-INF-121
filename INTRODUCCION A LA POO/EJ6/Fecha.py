class Fecha:
    def __init__(self, dia, mes, año):
        if self._fecha_valida(dia, mes, año):
            self.dia = dia
            self.mes = mes
            self.año = año
        else:
            raise ValueError("Fecha inválida")
    
    def _fecha_valida(self, dia, mes, año):
        if mes < 1 or mes > 12:
            return False
        
        dias_por_mes = [31, 29 if self._es_bisiesto(año) else 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        
        if dia < 1 or dia > dias_por_mes[mes-1]:
            return False
        
        return True
    
    def _es_bisiesto(self, año=None):
        if año is None:
            año = self.año
        return (año % 4 == 0 and año % 100 != 0) or (año % 400 == 0)
    
    def dia_siguiente(self):
        dia, mes, año = self.dia, self.mes, self.año
        dias_por_mes = [31, 29 if self._es_bisiesto() else 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        
        if dia < dias_por_mes[mes-1]:
            return Fecha(dia + 1, mes, año)
        elif mes < 12:
            return Fecha(1, mes + 1, año)
        else:
            return Fecha(1, 1, año + 1)
    
    def __str__(self):
        return f"{self.dia:02d}/{self.mes:02d}/{self.año}"

# Ejemplos de uso
try:
    fecha1 = Fecha(28, 2, 2020)  # Año bisiesto
    print(f"Fecha: {fecha1}")
    print(f"Es bisiesto? {fecha1._es_bisiesto()}")
    print(f"Día siguiente: {fecha1.dia_siguiente()}")
    
    fecha2 = Fecha(31, 12, 2023)
    print(f"\nFecha: {fecha2}")
    print(f"Día siguiente: {fecha2.dia_siguiente()}")
    
    # Esto generará error
    fecha_invalida = Fecha(30, 2, 2023)
except ValueError as e:
    print(f"\nError: {e}")