import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(createPinia())
app.use(router)

window.Kakao.init('5dbb1a82b99066e26c6f3e052a89a571') // 사용하려는 앱의 JavaScript 키 입력

app.mount('#app')
