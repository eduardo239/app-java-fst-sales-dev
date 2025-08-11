
Para execut  o projeto, basta executar o comando:

`./mvnw clean package -DskipTests`

E em seguida:

`java -jar target/proj-10-0.0.1-SNAPSHOT.jar`

## Modelos de Dados Principais
### User  
```{  
  username: { type: String, required: true, unique: true },  
  email: { type: String, required: true, unique: true },  
  password: { type: String, required: true },  
  role: { type: String, enum: ['admin', 'editor', 'viewer'], default: 'editor' },  
  createdAt: { type: Date, default: Date.now },  
  updatedAt: { type: Date, default: Date.now }  
}
```

### Content
```{  
  title: { type: String, required: true },  
  slug: { type: String, required: true, unique: true },  
  content: { type: String, required: true },  
  excerpt: { type: String },  
  status: { type: String, enum: ['draft', 'published', 'archived'], default: 'draft' },  
  author: { type: mongoose.Schema.Types.ObjectId, ref: 'User', required: true },  
  categories: [{ type: mongoose.Schema.Types.ObjectId, ref: 'Category' }],  
  tags: [String],  
  featuredImage: String,  
  seoTitle: String,  
  seoDescription: String,  
  publishedAt: Date,  
  createdAt: { type: Date, default: Date.now },  
  updatedAt: { type: Date, default: Date.now }  
}
```

### Category
```{
  name: { type: String, required: true },  
  slug: { type: String, required: true, unique: true },  
  description: String,  
  parent: { type: mongoose.Schema.Types.ObjectId, ref: 'Category' },  
  createdAt: { type: Date, default: Date.now },  
  updatedAt: { type: Date, default: Date.now }  
}
```

## Principais Endpoints da API
Autenticação
POST    /api/auth/register - Registrar novo usuário  
POST    /api/auth/login - Login de usuário  
GET     /api/auth/me - Obter informações do usuário logado  

### Usuários
GET     /api/users - Listar usuários (apenas admin)  
GET     /api/users/:id - Obter usuário específico  
PUT     /api/users/:id - Atualizar usuário  
DELETE  /api/users/:id - Deletar usuário (apenas admin)  

### Conteúdo
GET     /api/contents - Listar todos os conteúdos (com filtros)  
POST    /api/contents - Criar novo conteúdo  
GET     /api/contents/:slug - Obter conteúdo por slug  
PUT     /api/contents/:id - Atualizar conteúdo  
DELETE  /api/contents/:id - Deletar conteúdo  
GET     /api/contents/search?q=query - Buscar conteúdos  

### Categorias
GET     /api/categories - Listar todas as categorias  
POST    /api/categories - Criar nova categoria  
GET     /api/categories/:slug - Obter categoria por slug  
PUT     /api/categories/:id - Atualizar categoria  
DELETE  /api/categories/:id - Deletar categoria  

### Mídia
POST    /api/media/upload - Upload de arquivos de mídia  
GET     /api/media - Listar arquivos de mídia  
DELETE  /api/media/:id - Deletar arquivo de mídia  



## Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/cms/
│   │   ├── config/          # Configurações do Spring
│   │   ├── controller/      # Controladores REST
│   │   ├── dto/             # Objetos de Transferência de Dados
│   │   ├── exception/       # Tratamento de exceções
│   │   ├── model/           # Entidades JPA
│   │   ├── repository/      # Interfaces JPA
│   │   ├── security/        # Configurações de segurança
│   │   ├── service/         # Lógica de negócios
│   │   └── CmsApplication.java # Classe principal
│   └── resources/
│       ├── application.yml  # Configurações do aplicativo
│       └── data.sql         # Dados iniciais (opcional)
└── test/                    # Testes
```