import axios from "axios";

const http = axios.create({
    baseURL: "http://localhost:9000"
})

export default {
    getAllCategories(){
        return http.get('categories')
    },

    getFirstTenMovies(){
        return http.get('movies')
    }
}