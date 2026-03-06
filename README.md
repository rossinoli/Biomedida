# 📱 BioMedida - Calculadora de IMC em Java
O **BioMedida** é um aplicativo Android desenvolvido em **Java** para o cálculo do Índice de Massa Corporal (IMC). O projeto foca na simplicidade de uso, com uma interface limpa e funcional, demonstrando o domínio de componentes nativos do Android e lógica de programação.

## 🎯 Funcionalidades e Estrutura
O sistema processa dados antropométricos para fornecer um feedback imediato sobre a saúde do usuário.
| Recurso | Descrição | Componente Envolvido |
| :--- | :--- | :--- |
| **Entrada de Dados** | Campos para Peso e Altura com teclado numérico automático. | `EditText` (InputType: NumberDecimal) |
| **Cálculo de IMC** | Lógica matemática para processar o índice com base nos inputs. | Java Logic (MainActivity) |
| **Feedback Visual** | Exibição do resultado e classificação do peso. | `TextView` / `Toast` |
| **Modo Escuro** | Interface adaptada para visualização confortável em Dark Mode. | `themes.xml` (Night) |

## 🛠️ Configurações e Tecnologias
* **Linguagem:** Java
* **Plataforma:** Android (SDK Nativa)
* **Interface:** XML (ConstraintLayout / LinearLayout)
* **IDE:** Android Studio

## ⚙️ Instruções de Instalação (Setup)
Para rodar o projeto em sua máquina local ou emular no Android Studio, siga os passos abaixo:
1. **Clone o Repositório:**
   ```bash
   git clone [https://github.com/rossinoli/BioMedida.git](https://github.com/rossinoli/BioMedida.git)

### 2. Abrindo o Projeto
* No **Android Studio**, vá em `File > Open`.
* Navegue até a pasta onde você clonou o repositório e selecione a pasta raiz (BioMedida).

### 3. Sincronização do Gradle
* Assim que abrir, o Android Studio começará a baixar as dependências automaticamente através do Gradle.
* Certifique-se de que os arquivos `build.gradle.kts` e `settings.gradle.kts` estão presentes para que a sincronização ocorra sem erros.

### 4. Execução e Teste
* Com a sincronização concluída, selecione um dispositivo (físico via USB ou um emulador virtual).
* Clique no botão **Run** (ícone de triângulo verde) para compilar e instalar o app no dispositivo.

## 📂 Estrutura de Arquivos Principais
Para facilitar a navegação no projeto, os arquivos mais importantes estão organizados assim:
* **`app/src/main/java/`**: Contém toda a lógica de negócio, incluindo a validação dos campos e o cálculo do IMC feito em Java.
* **`app/src/main/res/layout/`**: Onde residem os arquivos XML que definem a interface visual, como botões e campos de texto.
* **`app/src/main/AndroidManifest.xml`**: O arquivo essencial que declara os componentes do app para o sistema Android.
* **`build.gradle.kts`**: Arquivo de configuração que gerencia as versões das bibliotecas e ferramentas do projeto.

---
⭐ **Desenvolvido como projeto de estudo para consolidar conceitos de Android Nativo com Java.**
