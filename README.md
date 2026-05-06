# Birthday Card Generator

Projeto de estudo feito com Kotlin Multiplatform e Compose Multiplatform para Android e iOS.

O app mostra um cartão de aniversário simples, com imagem de fundo e textos sobrepostos. A ideia principal é servir como base de aprendizado para:

- compartilhar UI entre plataformas com Compose Multiplatform;
- organizar código comum em `commonMain`;
- manter pontos específicos de Android e iOS separados;
- praticar a estrutura básica de um app multiplataforma.

## Estrutura

- `composeApp/src/commonMain`: código e UI compartilhados entre as plataformas.
- `composeApp/src/androidMain`: implementações específicas do Android.
- `composeApp/src/iosMain`: implementações específicas do iOS.
- `iosApp`: ponto de entrada do app no Xcode.

## Como executar

### Android

Para gerar o build de desenvolvimento do Android, execute:

```shell
./gradlew :composeApp:assembleDebug
```

No Windows:

```shell
.\gradlew.bat :composeApp:assembleDebug
```

Você também pode abrir o projeto na IDE e rodar a configuração padrão de execução.

### iOS

Para rodar no iOS, abra a pasta `iosApp` no Xcode e execute o projeto por lá.

## Tecnologias

- Kotlin Multiplatform
- Compose Multiplatform
- Material 3

## Observação

O conteúdo da tela principal é simples e pode ser alterado facilmente para testar novos layouts, textos, imagens e estilos enquanto o projeto evolui como estudo.
