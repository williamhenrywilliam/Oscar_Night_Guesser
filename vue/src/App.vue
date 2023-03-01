<template>
  <div id="app">
      <header>
        <nav>
          <router-link to="/">Home</router-link> |
          <router-link to="/oscars">Oscars</router-link> |
          <router-link to="/stats">Stats</router-link>
        </nav>
      </header>

      <main>
        <router-view/>
      </main>

      <footer>
        <div>
          <p>This is the Footer</p>
        </div>
      </footer>
  </div>
</template>

<script>
</script>

<style>

body {
  margin: 0;

}

#app {
  display: grid;
  grid-template-rows: 5% 90% 5%;
  grid-template-areas:
    "header"
    "main"
    "footer"
  ;
  height: 100vh;

  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  
}

header {
  grid-area: "header";
  display: flex;
  justify-content: center;
  background-color: #333;
  color: white;
  border: 1px solid purple;
  font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
  
}


main {
  grid-area: "main";
  
  border: 1px solid green;
}

footer {
  grid-area: "footer";
  background-color: #333;
  color: white;
  border: 1px solid pink;
}

nav {
  padding: 10px;
}

nav a {
  font-weight: bold;
  color: white;
}

nav a.router-link-exact-active {
  color: #42b983;
}


</style>
