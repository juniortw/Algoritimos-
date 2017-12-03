def validador(digitos, baseOrigem, baseDestino): 
  for digito in digitos: 
    if int(digito) >= baseOrigem or baseDestino > 16 or baseOrigem > 16: 
      return False 
  return True 
  
  
def conversorDecimalParaBase(valor, baseDestino): 
  lista = [] 
  retorno = "" 
  while(valor >= baseDestino): 
    lista.append(valor % baseDestino) 
    valor = int(valor / baseDestino) 
  lista.append(valor % baseDestino) 
  tamanho = len(lista) 
  for i in range(0, tamanho): 
    if lista[i] == 10: 
      lista[i] = 'A' 
    elif lista[i] == 11: 
      lista[i] = 'B' 
    elif lista[i] == 12: 
      lista[i] = 'C' 
    elif lista[i] == 13: 
      lista[i] = 'D' 
    elif lista[i] == 14: 
      lista[i] = 'E' 
    elif lista[i] == 15: 
      lista[i] = 'F' 
    retorno += str(lista[tamanho - i - 1]) 
  return retorno 
  
  
def conversorBaseParaDecimal(valor, baseOrigem, baseDestino): 
  digitos = list(str(valor)) 
  for i in range(0, len(digitos)): 
    if digitos[i] == 'A': 
      digitos[i] = 10 
    elif digitos[i] == 'B': 
      digitos[i] = 11 
    elif digitos[i] == 'C': 
      digitos[i] = 12 
    elif digitos[i] == 'D': 
      digitos[i] = 13 
    elif digitos[i] == 'E': 
      digitos[i] = 14 
    elif digitos[i] == 'F': 
      digitos[i] = 15 
  if validador(digitos, baseOrigem, baseDestino): 
    tamanho = len(digitos) 
    retorno = 0 
    for digito in range(0, tamanho): 
      x = digitos[digito] 
      digitos[digito] = int(x) * (baseOrigem ** (tamanho - digito - 1)) 
    for digito in digitos: 
      retorno += digito 
    return "Valor Convertido: " + conversorDecimalParaBase(retorno, baseDestino) 
  else: 
    return "Valores inválidos" 
  
  
def Main(): 
  valor = input("Número: ") 
  baseOrigem = int(input("Base Origem: ")) 
  baseDestino = int(input("Base Destino: ")) 
  print(conversorBaseParaDecimal(valor, baseOrigem, baseDestino)) 
   
   
Main() 
