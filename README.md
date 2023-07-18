<h1 align="center"> Desafio Android - Banco Carrefour</h1>

<p align="center">
  <a href="https://android-arsenal.com/api?level=23"><img alt="API" src="https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat"/></a>
</p>

<p align="center">  
App Android Kotlin que utliza API do GITHUB - Nesse caso listamos os repositórios mais populares
</p>

## API
Como não há API oficial para repositórios de tendências (é uma das APIs internas do GitHub),
<br />
Eu decidir usar [GitHub Search API](https://developer.github.com/v3/search/#search-repositories)

## Tecnologias
- Minimum SDK level 23
- [Kotlin](https://kotlinlang.org/) based + [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous.
- Baseado em [Kotlin](https://kotlinlang.org/) + [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) para requisições assíncrono
- Dagger-Hilt (alpha) para injeção de dependência.
- JetPack
  - LiveData.
  - Lifecycle.
  - ViewModel.
  - Navigation Component.
  - Data Binding.
- Architecture
  - Arquitetura MVVM (View - DataBinding - ViewModel - Model)
  - Padrão Repository
- [Glide](https://github.com/bumptech/glide) - loading de imagens.
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit) - biblioteca padrão para consumo de APIs.
- [Material-Components](https://github.com/material-components/material-components-android) - Padrão e boas praticas de criação de layouts.


