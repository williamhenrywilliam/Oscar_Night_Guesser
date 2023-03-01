<template>
  <div class="home-container">
    <header>
      <h1>Oscar Movies</h1>
    </header>
   <main>
    <div class="api-container">
      <div class="movie-container" v-for="movie in movies" v-bind:key="movie.movieTitle">
          <h2> {{ movie.movieTitle }}</h2>
          <img class="poster-image" :src="`https://image.tmdb.org/t/p/w500${movie.posterImage}`" alt="poster image"/>
      </div>
    </div>
   </main>
  </div>
</template>

<script>

import CategoryService from '../services/CategoryService';


export default {
  name: 'HomePage',
  props: {
    msg: String,
  },
  data(){
    return {
      movies: []
    }
  },
  created(){
    CategoryService.getFirstTenMovies()
      .then(response => {
        console.log(response);
        this.movies = response.data;
      })
      .catch(error => {
        console.log(error);
      });
  }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.api-container {
  display: grid;
  grid-template-columns: repeat(3, 4fr);
}

.movie-container {
  margin: 100px;
}

.poster-image{
  width: 300px;
  height: auto;
}


</style>
