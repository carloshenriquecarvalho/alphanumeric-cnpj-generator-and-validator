function copyCnpj() {
    const cnpj = document.getElementById("generated-cnpj").textContent;
    const button = document.querySelector(".copy-button");

    navigator.clipboard.writeText(cnpj)
        .then(() => {
            button.textContent = "✅ Copiado!";
            setTimeout(() => {
                button.textContent = "Copiar";
            }, 2000);
        });
}